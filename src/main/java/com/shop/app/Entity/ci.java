package com.shop.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name ="ci")

public class ci
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ci;
    private long cnp;
    private String serie;
    private int nr;
    @OneToOne(mappedBy = "ci")
    private clienti clienti ;


    public ci(int id_ci, long cnp, String serie, int nr) {
        this.id_ci = id_ci;
        this.cnp = cnp;
        this.serie = serie;
        this.nr = nr;
    }

    public ci() {
    }

    public int getId_ci() {
        return id_ci;
    }

    public void setId_ci(int id_ci) {
        this.id_ci = id_ci;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
