package com.shop.app.Entity;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "produs")
@JsonIdentityInfo(scope = produs.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_produs")

public class produs
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produs;
    private String nume_produs;
    private Double pret_produs;
    private String desc_produs;

    @OneToMany(targetEntity = review.class, mappedBy = "produs_review", cascade = CascadeType.ALL)
    //@JsonManagedReference(value = "produs-review")
    private List<review> produs_reviews;

    @OneToMany(targetEntity = factura.class, mappedBy = "produs_factura", cascade = CascadeType.ALL)
    //@JsonManagedReference(value = "produs-facturi")
    private List<factura> produs_facturi;

    public produs() {
    }

    public produs(int id_produs, String nume_produs, Double pret_produs, String desc_produs, List<review> produs_reviews, List<factura> produs_facturi) {
        this.id_produs = id_produs;
        this.nume_produs = nume_produs;
        this.pret_produs = pret_produs;
        this.desc_produs = desc_produs;
        this.produs_reviews = produs_reviews;
        this.produs_facturi = produs_facturi;
    }

    public int getId_produs() {
        return id_produs;
    }

    public void setId_produs(int id_produs) {
        this.id_produs = id_produs;
    }

    public String getNume_produs() {
        return nume_produs;
    }

    public void setNume_produs(String nume_produs) {
        this.nume_produs = nume_produs;
    }

    public Double getPret_produs() {
        return pret_produs;
    }

    public void setPret_produs(Double pret_produs) {
        this.pret_produs = pret_produs;
    }

    public String getDesc_produs() {
        return desc_produs;
    }

    public void setDesc_produs(String desc_produs) {
        this.desc_produs = desc_produs;
    }

    public List<review> getProdus_reviews() {
        return produs_reviews;
    }

    public void setProdus_reviews(List<review> produs_reviews) {
        this.produs_reviews = produs_reviews;
    }

    public List<factura> getProdus_facturi() {
        return produs_facturi;
    }

    public void setProdus_facturi(List<factura> produs_facturi) {
        this.produs_facturi = produs_facturi;
    }


}
