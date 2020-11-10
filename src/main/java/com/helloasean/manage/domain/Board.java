package com.helloasean.manage.domain;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@Entity
@Getter
public class Board {
    @Id @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private String subject;

    private String content;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Role role;

    @Column(nullable = true)
    private List<Blob> files;
}
