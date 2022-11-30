package com.example.Website.model;

public class Cothu {
    private Integer id;
    private String ten;
    private String namsinh;
    private String quoctich;
    private int elohientai;

    public Cothu() {
    }

    public Cothu(Integer id, String ten, String namsinh, String quoctich, int elohientai) {
        this.id = id;
        this.ten = ten;
        this.namsinh = namsinh;
        this.quoctich = quoctich;
        this.elohientai = elohientai;
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

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public int getElohientai() {
        return elohientai;
    }

    public void setElohientai(int elohientai) {
        this.elohientai = elohientai;
    }
}
