package com.example.sample01.main.controller;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String main(Model model) throws Exception {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return "main";
    }

    @GetMapping("/hello")
    public String hello(Model model) throws Exception {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return "/hello";
    }

}