package com.helloasean.manage.domain;

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
}
