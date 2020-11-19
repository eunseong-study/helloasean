package com.helloasean.manage.service;

import com.helloasean.manage.domain.Member;
import com.helloasean.manage.domain.Role;
import com.helloasean.manage.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public String memberRegister(Member member) {
        return memberRepository.save(member).getEmail();
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findById(username).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 유저입니다."));
        List<GrantedAuthority> authorities = new ArrayList<>();
        Role role = member.getRole();
        if (role.equals(Role.ROLE_BOSS)) {
            authorities.add(new SimpleGrantedAuthority(Role.ROLE_BOSS.toString()));
        } else if (role.equals(Role.ROLE_MANAGER)) {
            authorities.add(new SimpleGrantedAuthority(Role.ROLE_MANAGER.toString()));
        } else {
            authorities.add(new SimpleGrantedAuthority(Role.ROLE_MEMBER.toString()));
        }
        return new User(member.getEmail(), member.getPassword(), authorities);
    }
}
