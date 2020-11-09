package com.helloasean.manage.board;

import com.helloasean.manage.member.Role;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Board {

    @Id @GeneratedValue
    private Long id;

    private int boardType;

    private String subject;

    private String content;

    private String file;

    private Role role;
}
