package com.example.Website.controller;

import com.example.Website.dao.CothuDAO;
import com.example.Website.dao.RoundDAO;
import com.example.Website.model.Cothu;
import com.example.Website.model.Round;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;

@Controller
public class ChonRoundDanhSachController {
    @GetMapping("/gdDanhsachcothu")
    public String getDanhsachcothu(Model model){
        RoundDAO roundDAO= new RoundDAO();
        List<Round> roundList = roundDAO.getDSRound();

        model.addAttribute("roundList",roundList);
        return "gdDanhsachcothu";
    }
    @PostMapping("/gdDanhsachcothu")
    public String postDanhsachcothu(@ModelAttribute("ct") Cothu ct, Model model){
        System.out.println(ct.getId());
        return "gdDanhsachcothu";
    }

    @GetMapping("/gdDanhsachcothu2")
    public String getDanhsachcothu2(Model model){
        CothuDAO cothuDAO=new CothuDAO();
        List<Cothu> cothuList=cothuDAO.getDSCothu();

        Comparator<Cothu> comparator = new Comparator<Cothu>() {
            @Override
            public int compare(Cothu left, Cothu right) {
                return right.getElohientai() - left.getElohientai(); // use your logic
            }
        };
        Collections.sort(cothuList, comparator);
        model.addAttribute("cothuList",cothuList);
        return "gdDanhsachcothu";
    }

}
