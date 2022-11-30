package com.example.Website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChiTietCapDauController {
    @GetMapping("/gdChiTietCapDau")
    public String getDanhsachcothu(Model model){

        return "gdChiTietCapDau";
    }
}
