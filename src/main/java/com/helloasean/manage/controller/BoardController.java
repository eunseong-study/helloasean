package com.helloasean.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/main")
    public String main(@RequestParam int page, @RequestParam int board_type) {

        return "board/board_main";
    }

    @GetMapping("/read")
    public String read(@RequestParam int board_type, @RequestParam Long board_id, Model model) {

        return "board/board_read";
    }

    @GetMapping("/write")
    public String write(@RequestParam int board_type) {

        return "board/board_write";
    }

    @PostMapping("/write")
    public String writePro(@Valid @ModelAttribute("boardDto") BoardDto boardDto, BindingResult result, Model model) {

        return "board/write_success";
    }

    @GetMapping("/modify")
    public String modify(@RequestParam int board_type,@RequestParam Long board_id, Model model){

        return "board/board_modify";
    }

    @PostMapping("modify")
    public String modifyPro(@Valid @ModelAttribute("boardDto") BoardDto boardDto, BindingResult result, Model model) {

        return "board/modify_success";
    }
}
