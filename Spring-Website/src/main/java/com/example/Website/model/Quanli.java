package com.example.Website.model;

public class Quanli {
    private Integer id;
    private String username;
    private String password;
    private String ten;
    private int tuoi;
    private String sdt;

    public Quanli() {
    }

    public Quanli(Integer id, String username, String password, String ten, int tuoi, String sdt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ten = ten;
        this.tuoi = tuoi;
        this.sdt = sdt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Quanli{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
