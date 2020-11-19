package com.helloasean.manage.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberDto {
    private String username;
    private String email;
    private String password;
    private String password2;
}
