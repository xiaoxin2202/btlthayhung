package com.example.Website.controller;

import com.example.Website.dao.CothuDAO;
import com.example.Website.model.Ban;
import com.example.Website.model.Cothu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class XepCapController {
    @GetMapping("/gdXepCapThiDau")
    public String getXepCapThiDau(Model model) {
        model.addAttribute("banList", process());
        return "gdXepcapthidau";
    }

    public List<Ban> process() {
        CothuDAO cothuDAO = new CothuDAO();
        List<Cothu> cothuList = cothuDAO.getDSCothu();

        Comparator<Cothu> comparator = new Comparator<Cothu>() {
            @Override
            public int compare(Cothu left, Cothu right) {
                return right.getElohientai() - left.getElohientai(); // use your logic
            }
        };
        Collections.sort(cothuList, comparator);

        Ban ban = new Ban();
        List<Ban> banList = new ArrayList<>();
        int dem = 1;
        for (int i = 0; i < cothuList.size(); i = i + 2) {
            ban = new Ban(dem, cothuList.get(i), cothuList.get(i + 1));
            banList.add(ban);
            dem += 1;
        }
        return banList;
    }

    @GetMapping("/gdChiTietCapDau/{id}")
    public String getChiTietTranDau(@PathVariable int id, Model model) {

        List<Ban> banlist = process();
        Ban ban = new Ban();
        for (int i = 0; i < banlist.size(); i++) {
            if (id == banlist.get(i).getId()) {
                ban = new Ban(id, banlist.get(i).getP1(), banlist.get(i).getP2());
                break;
            }
        }
        System.out.println(ban.getP1().getTen() + " " + ban.getP2().getTen());
        model.addAttribute("ban",ban);
        return "gdChiTietCapDau";
    }

}
