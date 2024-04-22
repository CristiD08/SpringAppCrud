package com.shop.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "adresa")
public class adresa
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_adresa;
    private String oras;
    private String strada;
    private int nr;
    private String bloc;
    private String scara;
    private int etaj;
    private int ap;
    @OneToOne(mappedBy = "adresa")
    private clienti clienti;

    public adresa(int id_adresa, String oras, String strada, int nr, String bloc, String scara, int etaj, int ap) {
        this.id_adresa = id_adresa;
        this.oras = oras;
        this.strada = strada;
        this.nr = nr;
        this.bloc = bloc;
        this.scara = scara;
        this.etaj = etaj;
        this.ap = ap;
    }

    public adresa() {
    }

    public int getId_adresa() {
        return id_adresa;
    }

    public void setId_adresa(int id_adresa) {
        this.id_adresa = id_adresa;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }
}
