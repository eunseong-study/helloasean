package com.helloasean.manage.domain;

import com.helloasean.manage.domain.dto.MemberDto;
import com.helloasean.manage.repository.MemberRepository;
import com.helloasean.manage.service.MemberService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id
    private String email;

    private String username;

    private String password;

    @OneToOne(mappedBy = "member")
    private Board board;

    @Enumerated(EnumType.STRING)
    private Role role;

    public void toEntity(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = Role.ROLE_MEMBER;
    }
}
