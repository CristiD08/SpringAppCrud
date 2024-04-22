package com.shop.app.Service.Impl;

import com.shop.app.Entity.adresa;
import com.shop.app.Repository.AdresaRepo;
import com.shop.app.Service.AdresaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresaImpl implements AdresaService {

    AdresaRepo adresaRepo;

    public AdresaImpl(AdresaRepo adresaRepo) {
        this.adresaRepo = adresaRepo;
    }

    @Override
    public String createAdresa(adresa adresa) {
        adresaRepo.save(adresa);
        return "Ok";
    }

    @Override
    public String updateAdresa(adresa adresa) {
        adresaRepo.save(adresa);
        return "Updated";
    }

    @Override
    public String deleteAdresa(int id_adresa){
        adresaRepo.deleteById(id_adresa);
        return "Deleted";
    }

    @Override
    public adresa getAdresa(int id_adresa) {

        return adresaRepo.findById(id_adresa).get();
    }

    @Override
    public List<adresa> getAllAdrese() {
        return adresaRepo.findAll();
    }
}
