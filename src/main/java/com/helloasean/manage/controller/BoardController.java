package com.helloasean.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/main")
    public String main(@RequestParam int page, @RequestParam int board_type) {

        return "board/board_main";
    }
}
