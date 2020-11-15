package com.helloasean.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeetingController {

    @GetMapping("/meeting")
    public String meeting(){
        return "board/meeting";
    }
}
