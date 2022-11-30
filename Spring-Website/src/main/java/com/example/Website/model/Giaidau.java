package com.example.Website.model;

import java.util.Date;
import java.util.List;

public class Giaidau {
    private Integer id;
    private String name;
    private String diadiem;
    private Date thoigian;
    private List<Quanli> quanliList;
    private List<Cothu> cothuList;
    private String mota;

    public Giaidau() {
    }

    public Giaidau(Integer id, String name, String diadiem, Date thoigian, List<Quanli> quanliList, List<Cothu> cothuList, String mota) {
        this.id = id;
        this.name = name;
        this.diadiem = diadiem;
        this.thoigian = thoigian;
        this.quanliList = quanliList;
        this.cothuList = cothuList;
        this.mota = mota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(String diadiem) {
        this.diadiem = diadiem;
    }

    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }

    public List<Quanli> getQuanliList() {
        return quanliList;
    }

    public void setQuanliList(List<Quanli> quanliList) {
        this.quanliList = quanliList;
    }

    public List<Cothu> getCothuList() {
        return cothuList;
    }

    public void setCothuList(List<Cothu> cothuList) {
        this.cothuList = cothuList;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
