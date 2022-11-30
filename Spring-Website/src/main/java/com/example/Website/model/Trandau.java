package com.example.Website.model;

import java.util.Date;

public class Trandau {
    private Integer id;
    private String ten;
    private Date thoigian;

    public Trandau() {
    }

    public Trandau(Integer id, String ten, Date thoigian) {
        this.id = id;
        this.ten = ten;
        this.thoigian = thoigian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }
}
