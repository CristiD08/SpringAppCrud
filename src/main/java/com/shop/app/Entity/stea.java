package com.shop.app.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.lang.ref.Reference;
import java.util.List;

@Entity
@Table(name = "stea")
@JsonIdentityInfo(scope = stea.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_stea")
public class stea
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_stea;
    private int nr_stele;
    private String text;
    private String culoare;

    @OneToMany(targetEntity = review.class, mappedBy = "stea_review", cascade = CascadeType.ALL)
    //@JsonManagedReference(value = "review-stea")
    private List<review> reviews_stele;

    public stea() {
    }

    public stea(int id_stea, int nr_stele, String text, String culoare, List<review> reviews_stele) {
        this.id_stea = id_stea;
        this.nr_stele = nr_stele;
        this.text = text;
        this.culoare = culoare;
        this.reviews_stele = reviews_stele;
    }

    public int getId_stea() {
        return id_stea;
    }

    public void setId_stea(int id_stea) {
        this.id_stea = id_stea;
    }

    public int getNr_stele() {
        return nr_stele;
    }

    public void setNr_stele(int nr_stele) {
        this.nr_stele = nr_stele;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<review> getReviews_stele() {
        return reviews_stele;
    }

    public void setReviews_stele(List<review> reviews_stele) {
        this.reviews_stele = reviews_stele;
    }


}
