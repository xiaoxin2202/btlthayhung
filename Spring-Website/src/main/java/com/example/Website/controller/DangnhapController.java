package com.example.Website.controller;

import com.example.Website.dao.DangnhapDAO;
import com.example.Website.model.Quanli;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DangnhapController {
    @GetMapping("/")
    public String dangNhap(Model model){

        return "index";
    }
    @PostMapping("/")
    public String dangNhap(@ModelAttribute("quanli") Quanli quanli, Model model) {
        DangnhapDAO dangNhapDAO=new DangnhapDAO();
        Quanli ql=dangNhapDAO.dangNhap(quanli.getUsername(),quanli.getPassword());
        if(ql==null){
            return "index";
        }else{
            model.addAttribute("quanli",ql);
            return "gdChinhQL";
        }
    }
    @GetMapping("/gdChinhQL")
    public String getTrangChinh(){
        return "gdChinhQL";
    }

}
