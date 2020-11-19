package com.helloasean.manage.service;

import com.helloasean.manage.domain.Member;
import com.helloasean.manage.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Long memberRegister(Member member) {
        return memberRepository.save(member).getId();
    }
}
