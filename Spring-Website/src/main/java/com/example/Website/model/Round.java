package com.example.Website.model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class Round {
    private int id;
    private String listIdCothu;
    private String listIdTrandau;


    public Round() {
    }

    public Round(int id, String listIdCothu, String listIdTrandau) {
        this.id = id;
        this.listIdCothu = listIdCothu;
        this.listIdTrandau = listIdTrandau;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListIdCothu() {
        return listIdCothu;
    }

    public void setListIdCothu(String listIdCothu) {
        this.listIdCothu = listIdCothu;
    }

    public String getListIdTrandau() {
        return listIdTrandau;
    }

    public void setListIdTrandau(String listIdTrandau) {
        this.listIdTrandau = listIdTrandau;
    }
}
