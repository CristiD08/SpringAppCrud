
package com.shop.app.Controller;


import com.shop.app.Entity.produs;
import com.shop.app.Records.ProdusDTO;
import com.shop.app.Repository.ProdusRepo;
import com.shop.app.Service.ProdusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/produs")
public class Produs_Controller
{
    ProdusService produsService;
    ProdusRepo produsRepo;


    public Produs_Controller(ProdusRepo produsRepo, ProdusService produsService) {
        this.produsRepo = produsRepo;
        this.produsService = produsService;
    }

    @GetMapping("/{id_produs}")
    public produs getProdusInfo(@PathVariable("id_produs") int id_produs)
    {
    return produsService.getProdus(id_produs);
    }

    @GetMapping
    public List<produs> getProduseInfo()
    {
        return produsService.getAllProduse();
    }

    @PostMapping
    public String createProdus(@RequestBody produs produs)
    {
        produsService.createProdus(produs);
        return "Produs creat cu succes";
    }

    @PutMapping("/update_produs/{id_produs}")
    public String updateProdus(@PathVariable("id_produs") int id_produs,  @RequestBody produs produs)
    {
        produs produs_update = produsService.getProdus(id_produs);
        produs_update.setNume_produs(produs.getNume_produs());
        produs_update.setPret_produs(produs.getPret_produs());
        produs_update.setDesc_produs(produs.getDesc_produs());
        produsService.updateProdus(produs_update);
        return "Produs actualizat cu succes";
    }

    @DeleteMapping("/deleteProdus-{id_produs}")
    public String deleteProdus(@PathVariable("id_produs") int id_produs)
    {
        produsService.deleteProdus(id_produs);
        return "Produs sters cu succes";
    }

    @GetMapping("/DTO/{id_produs}")
    public ProdusDTO getProdusDTO(@PathVariable("id_produs") int id_produs)
    {
        return produsService.getProdusDTO(id_produs);
    }

    @GetMapping("/DTO")
    public List<ProdusDTO> getProduseDTO()
    {
        return produsService.getAllProduseDTO();
    }

}
