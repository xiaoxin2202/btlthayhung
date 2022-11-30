package com.example.Website.controller;

import com.example.Website.model.Quanli;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    @GetMapping("/login")
    public String test(){
        return "indextest";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("quanli")Quanli quanli){
        System.out.println(quanli.toString());
        return "indextest";
    }
}
