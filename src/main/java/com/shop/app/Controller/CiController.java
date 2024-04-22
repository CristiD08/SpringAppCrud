package com.shop.app.Controller;

import com.shop.app.Entity.ci;
import com.shop.app.Service.CiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/clienti/ci")
public class CiController
{

    CiService ciService;

    public CiController(CiService ciService) {
        this.ciService = ciService;
    }

    @GetMapping("/{id_ci}")
    public ci getCiInfo(@PathVariable("id_ci") int id_ci)
    {
        return ciService.getCi(id_ci);
    }

    @GetMapping
    public List<ci> getAllCi()
    {
        return ciService.getAllCi();
    }

    @PostMapping
    public String createCi(@RequestBody ci ci)
    {
        ciService.createCi(ci);
        return "Ci creat cu succes";

    }

    @PutMapping("update_ci/{id_ci}")
    public String updateCi(@PathVariable("id_ci") int id_ci, @RequestBody ci ci)
    {
        ci ci_update = ciService.getCi(id_ci);
        ci_update.setCnp(ci.getCnp());
        ci_update.setNr(ci.getNr());
        ci_update.setSerie(ci.getSerie());
        ciService.updateCi(ci_update);
        return "Ci actualizat cu succes";
    }

    @DeleteMapping("/deleteCi-{id_ci}")
    public String deleteCi(@PathVariable("id_ci") int id_ci)
    {
        ciService.deleteCi(id_ci);
        return "Ci eliminat cu succes";
    }
}
