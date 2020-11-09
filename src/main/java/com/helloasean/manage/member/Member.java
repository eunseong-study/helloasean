package com.helloasean.manage.member;

import javax.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue
    private long id;

    private String email;

    private String name;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
