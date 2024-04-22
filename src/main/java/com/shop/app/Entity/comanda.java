package com.shop.app.Entity;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "comanda")
@JsonIdentityInfo(scope = comanda.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_comanda")
public class comanda
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_comanda;
    private String data_comanda;
    private String tip_plata;
    private String data_livrare;

    @ManyToOne
    @JoinColumn(name = "client_fk", referencedColumnName = "id_client")
    //@JsonBackReference(value = "clienti-comanda")
    private clienti client_comanda;

    @OneToMany(targetEntity = factura.class, mappedBy = "comanda_factura", cascade = CascadeType.ALL)
    //@JsonManagedReference(value = "comanda-facturi")
    private List<factura> comanda_facturi;

    public comanda() {
    }

    public comanda(int id_comanda, String data_comanda, String tip_plata, String data_livrare, clienti client_comanda, List<factura> comanda_facturi) {
        this.id_comanda = id_comanda;
        this.data_comanda = data_comanda;
        this.tip_plata = tip_plata;
        this.data_livrare = data_livrare;
        this.client_comanda = client_comanda;
        this.comanda_facturi = comanda_facturi;
    }

    public int getId_comanda() {
        return id_comanda;
    }

    public void setId_comanda(int id_comanda) {
        this.id_comanda = id_comanda;
    }

    public String getData_comanda() {
        return data_comanda;
    }

    public void setData_comanda(String data_comanda) {
        this.data_comanda = data_comanda;
    }

    public String getTip_plata() {
        return tip_plata;
    }

    public void setTip_plata(String tip_plata) {
        this.tip_plata = tip_plata;
    }

    public String getData_livrare() {
        return data_livrare;
    }

    public void setData_livrare(String data_livrare) {
        this.data_livrare = data_livrare;
    }

    public clienti getClient_comanda() {
        return client_comanda;
    }

    public void setClient_comanda(clienti client_comanda) {
        this.client_comanda = client_comanda;
    }

    public List<factura> getComanda_facturi() {
        return comanda_facturi;
    }

    public void setComanda_facturi(List<factura> comanda_facturi) {
        this.comanda_facturi = comanda_facturi;
    }


}
