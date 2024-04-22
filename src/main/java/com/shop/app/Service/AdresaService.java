package com.shop.app.Service;

import com.shop.app.Entity.adresa;

import java.util.List;

public interface AdresaService {
    public String createAdresa(adresa adresa);
    public String updateAdresa(adresa adresa);
    public String deleteAdresa(int id_adresa);
    public adresa getAdresa(int id_adresa);
    public List<adresa> getAllAdrese();
}
