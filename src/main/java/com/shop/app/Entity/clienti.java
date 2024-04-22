package com.shop.app.Entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clienti")
@JsonIdentityInfo(scope = clienti.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_client")
public class clienti
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_client;
    private String nume;
    private String prenume;

    @OneToOne
    @JoinColumn(name = "ci_fk")
    private ci ci;

    @OneToOne
    @JoinColumn(name = "adresa_fk")
    private adresa adresa;

    @OneToMany( mappedBy = "client_comanda")
    //@JsonManagedReference(value = "clienti-comanda")
    private List<comanda> comenzi;

    @OneToMany( mappedBy = "client_review")
    //@JsonManagedReference(value = "client-review")
    private List<review> reviews;

    public clienti() {
    }

    public clienti(int id_client, String nume, String prenume, ci ci, adresa adresa, List<comanda> comenzi, List<review> reviews) {
        this.id_client = id_client;
        this.nume = nume;
        this.prenume = prenume;
        this.ci = ci;
        this.adresa = adresa;
        this.comenzi = comenzi;
        this.reviews = reviews;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public ci getCi() {
        return ci;
    }

    public void setCi(ci ci) {
        this.ci = ci;
    }

    public adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(adresa adresa) {
        this.adresa = adresa;
    }

    public List<comanda> getComenzi() {
        return comenzi;
    }

    public void setComenzi(List<comanda> comenzi) {
        this.comenzi = comenzi;
    }

    public List<review> getReviews() {
        return reviews;
    }

    public void setReviews(List<review> reviews) {
        this.reviews = reviews;
   }

}
