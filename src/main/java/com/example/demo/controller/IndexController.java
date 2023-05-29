package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
//    @GetMapping("home")
//    public String home(){
//        return "home";
//    }
    @GetMapping("cards")
    public String cards(){
        return "cards";
    }
    @GetMapping("register")
    public String register(){
        return "register";
    }
    @GetMapping("home")
    public String home(){
        return "home";
    }
    @GetMapping("/")
    public String index(){
        return "index";
    }
//    @GetMapping("text2")
//    public String text(){
//        return "text2";
//    }

}
