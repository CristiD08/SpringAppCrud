
package com.shop.app.Entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;


@Entity
@Table(name = "factura")
@JsonIdentityInfo(scope = factura.class, generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_factura")
public class factura
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_factura;
    @ManyToOne
    @JoinColumn(name = "produs_factura_fk", referencedColumnName = "id_produs")
    //@JsonBackReference(value = "produs-facturi")
    private produs produs_factura;


    @ManyToOne
    @JoinColumn( name = "comanda_factura_fk", referencedColumnName = "id_comanda")
    //@JsonBackReference(value = "comanda-facturi")
    private comanda comanda_factura;

    private int cant;

    public factura() {
    }

    public factura(int id_factura, produs produs_factura, comanda comanda_factura, int cant) {
        this.id_factura = id_factura;
        this.produs_factura = produs_factura;
        this.comanda_factura = comanda_factura;
        this.cant = cant;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public produs getProdus_factura() {
        return produs_factura;
    }

    public void setProdus_factura(produs produs_factura) {
        this.produs_factura = produs_factura;
    }

    public comanda getComanda_factura() {
        return comanda_factura;
    }

    public void setComanda_factura(comanda comanda_factura) {
        this.comanda_factura = comanda_factura;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
}
