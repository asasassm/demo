package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String main(){

        return "index";
    }
    @RequestMapping("/buttons")
    public String main2(){

        return "buttons";
    }
    @RequestMapping("/2")
    public String main3(){

        return "text";
    }
    @RequestMapping("/3")
    public String main4(){

        return "text2";
    }
}