package com.helloasean.manage.controller;

import com.helloasean.manage.domain.Member;
import com.helloasean.manage.domain.dto.MemberDto;
import com.helloasean.manage.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
@EnableWebSecurity
public class AccountController {

    private final PasswordEncoder passwordEncoder;
    private final MemberService memberService;

    @GetMapping("/sign-up")
    public String signUp(@ModelAttribute("memberDto")MemberDto memberDto){
        return "account/sign-up";
    }

    @PostMapping("/sign-up")
    public String signUpCreate(@ModelAttribute("memberDto") MemberDto memberDto,
                               BindingResult result) {
        if (result.hasErrors()) {
            return "account/sign-up";
        } else {
            Member member = new Member();
            member.toEntity(memberDto.getEmail(),memberDto.getUsername(),passwordEncoder.encode(memberDto.getPassword()));
            memberService.memberRegister(member);
            return "account/sign-up-successed";
        }
    }

    @GetMapping("/logout")
    public String logout(){
        return "account/login";
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
