package com.example.Website.model;

public class Ban {
    private int id;
    private Cothu p1,p2;

    public Ban() {
    }

    public Ban(int id, Cothu p1, Cothu p2) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cothu getP1() {
        return p1;
    }

    public void setP1(Cothu p1) {
        this.p1 = p1;
    }

    public Cothu getP2() {
        return p2;
    }

    public void setP2(Cothu p2) {
        this.p2 = p2;
    }
}
