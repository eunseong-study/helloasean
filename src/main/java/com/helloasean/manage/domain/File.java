package com.helloasean.manage.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File {

    @Id @GeneratedValue
    @Column(name = "file_id")
    private Long id;

    private String name;

    private String fileName;

    private String filePath;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

}
