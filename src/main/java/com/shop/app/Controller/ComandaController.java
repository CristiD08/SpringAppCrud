package com.shop.app.Controller;

import com.shop.app.Entity.comanda;
import com.shop.app.Records.ComandaDTO;
import com.shop.app.Service.ComandaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/comanda")
public class ComandaController
{

    ComandaService comandaService;

    public ComandaController(ComandaService comandaService) {
        this.comandaService = comandaService;
    }

    @GetMapping("/{id_comanda}")
    public comanda getComanda(@PathVariable("id_comanda") int id_comanda)
    {
       return comandaService.getComanda(id_comanda);
    }

    @GetMapping
    public List<comanda> getAllComenzi()
    {
        return comandaService.getAllComenzi();
    }

    @PostMapping
    public String createComanda(@RequestBody comanda comanda)
    {

        comandaService.createComanda(comanda);

        return "Comanda creata cu succes";
    }


    @PutMapping("/update_comanda/{id_comanda}")
    public String updateComanda(@PathVariable("id_comanda") int id_comanda, @RequestBody comanda comanda)
    {
        comanda comanda_update = comandaService.getComanda(id_comanda);
        comanda_update.setData_comanda(comanda.getData_comanda());
        comanda_update.setTip_plata(comanda.getTip_plata());
        comanda_update.setData_livrare(comanda.getData_livrare());
        comanda_update.setClient_comanda(comanda.getClient_comanda());
        comandaService.updateComanda(comanda_update);
        return "Comanda atualizata cu succes";
    }

    @DeleteMapping("/deleteComanda-{id_comanda}")

    public String deleteComanda(@PathVariable("id_comanda") int id_comanda)
    {
        comandaService.deleteComanda(id_comanda);
        return "Comanda stearsa cu succes";
    }

    @GetMapping("/DTO/{id_comanda}")
    public ComandaDTO getComandaDTO(@PathVariable("id_comanda") int id_comanda)
    {
        return comandaService.getComandaDTO(id_comanda);
    }

    @GetMapping("/DTO")
    public List<ComandaDTO> getAllComenziDTO()
    {
        return comandaService.getAllComenziDTO();
    }


}
