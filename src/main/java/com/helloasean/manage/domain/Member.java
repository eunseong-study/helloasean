package com.helloasean.manage.domain;

import com.helloasean.manage.domain.dto.MemberDto;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(unique = true)
    private String email;

    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public void toEntity(MemberDto memberDto) {
        this.email = memberDto.getEmail();
        this.username = memberDto.getUsername();
        this.password = memberDto.getPassword();
        this.role = Role.ROLE_MEMBER;
    }
}
