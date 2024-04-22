package com.shop.app.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@Table(name = "review")
@JsonIdentityInfo(scope = review.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_review")
public class review
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_review;
    private String comentariu_review;

    @ManyToOne
    @JoinColumn(name = "client_review_fk", referencedColumnName = "id_client")
    //@JsonBackReference(value = "client-review")
    private clienti client_review;

    @ManyToOne
    @JoinColumn(name = "stea_fk", referencedColumnName = "id_stea")
    //@JsonBackReference(value = "review-stea")
    private stea stea_review;

    @ManyToOne
    @JoinColumn(name = "produs_fk", referencedColumnName = "id_produs")
    //@JsonBackReference(value = "produs-review")
    private produs produs_review;

    public review() {
    }

    public review(int id_review, String comentariu_review, clienti client_review/*, stea stea_review, produs produs_review*/) {
        this.id_review = id_review;
        this.comentariu_review = comentariu_review;
        this.client_review = client_review;
        this.stea_review = stea_review;
        this.produs_review = produs_review;
    }

    public int getId_review() {
        return id_review;
    }

    public void setId_review(int id_review) {
        this.id_review = id_review;
    }

    public String getComentariu_review() {
        return comentariu_review;
    }

    public void setComentariu_review(String comentariu_review) {
        this.comentariu_review = comentariu_review;
    }

    public clienti getClient_review() {
        return client_review;
    }

    public void setClient_review(clienti client_review) {
        this.client_review = client_review;
    }

    public stea getStea_review() {
        return stea_review;
    }

    public void setStea_review(stea stea_review) {
        this.stea_review = stea_review;
    }

    public produs getProdus_review() {
        return produs_review;
    }

    public void setProdus_review(produs produs_review) {
        this.produs_review = produs_review;
    }
}
