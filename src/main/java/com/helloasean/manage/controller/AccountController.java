package com.helloasean.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String signUp(){
        return "account/sign-up";
    }

    @GetMapping("/login")
    public String login(){
        return "account/login";
    }

    @GetMapping("/forgot-password")
    public String forgetPassword(){
        return "account/forgot-password";
    }
}
