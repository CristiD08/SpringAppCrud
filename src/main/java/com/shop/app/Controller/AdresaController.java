package com.shop.app.Controller;

import com.shop.app.Entity.adresa;
import com.shop.app.Service.AdresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/clienti/adresa")
public class AdresaController
{
    AdresaService adresaService;

    public AdresaController(AdresaService adresaService)
    {
        this.adresaService = adresaService;
    }

    @GetMapping("/{id_adresa}")
    public adresa getAdresaInfo(@PathVariable("id_adresa") int id_adresa)
    {
       return adresaService.getAdresa(id_adresa);
    }

    @GetMapping
    public List<adresa> getAllAdresa()
    {
        return  adresaService.getAllAdrese();
    }

    @PostMapping
    public String createAdresa(@RequestBody adresa adresa)
    {
        adresaService.createAdresa(adresa);
        return "Adresa creata cu succes";
    }

    @PutMapping("/update_adresa/{id_adresa}")
    public String updateAdresa(@PathVariable("id_adresa") int id_adresa, @RequestBody adresa adresa)
    {
        adresa adresa_update = adresaService.getAdresa(id_adresa);
        adresa_update.setOras(adresa.getOras());
        adresa_update.setStrada(adresa.getStrada());
        adresa_update.setNr(adresa.getNr());
        adresa_update.setBloc(adresa.getBloc());
        adresa_update.setScara(adresa.getScara());
        adresa_update.setEtaj(adresa.getEtaj());
        adresa_update.setAp(adresa.getAp());
        adresaService.updateAdresa(adresa_update);
        return "Adresa atualizata cu succes";
    }

    @DeleteMapping("deleteAdresa-{id_adresa}")
    public String deleteAdresa(@PathVariable("id_adresa") int id_adresa)
    {
        adresaService.deleteAdresa(id_adresa);
        return "Adresa stearsa cu succes";
    }

}
