package com.example.Website.model;

public class Thamgia {
    private Integer id;
    private Integer idCothu;
    private Integer idTrandau;
    private String tenDoithu;
    private String thaydoiElo;

    public Thamgia() {
    }
    public Thamgia(Integer id, Integer idCothu, Integer idTrandau, String tenDoithu, String thaydoiElo) {
        this.id = id;
        this.idCothu = idCothu;
        this.idTrandau = idTrandau;
        this.tenDoithu = tenDoithu;
        this.thaydoiElo = thaydoiElo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIdCothu() {
        return idCothu;
    }
    public void setIdCothu(Integer idCothu) {
        this.idCothu = idCothu;
    }
    public Integer getIdTrandau() {
        return idTrandau;
    }
    public void setIdTrandau(Integer idTrandau) {
        this.idTrandau = idTrandau;
    }
    public String getTenDoithu() {
        return tenDoithu;
    }

    public void setIdDoithu(String tenDoithu) {
        this.tenDoithu = tenDoithu;
    }

    public String getThaydoiElo() {
        return thaydoiElo;
    }

    public void setThaydoiElo(String thaydoiElo) {
        this.thaydoiElo = thaydoiElo;
    }
    public String getKetQua(){
        if(thaydoiElo.charAt(0)=='+'){
            return "Thắng";
        }else{
            return "Thua";
        }
    }
}
