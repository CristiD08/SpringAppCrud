
package com.shop.app.Controller;

import com.shop.app.Entity.stea;
import com.shop.app.Records.SteaDTO;
import com.shop.app.Service.SteaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/stea")
public class SteaController
{

    SteaService SteaService;

    public SteaController(SteaService steaService) {
        this.SteaService = steaService;
    }

    @GetMapping("/{id_stea}")
    public stea getSteaInfo(@PathVariable("id_stea") int id_stea)
    {
        return SteaService.getStea(id_stea);
    }

    @GetMapping
    public List<stea> getSteleInfo()
    {
        return SteaService.getAllStele();
    }

    @PostMapping
    public String CreateStea(@RequestBody stea stea)
    {
        SteaService.createStea(stea);
        return "Stea Creata cu succes";
    }

    @PutMapping("/update_stea/{id_stea}")
    public String UpdateStea(@PathVariable("id_stea") int id_stea, @RequestBody stea stea)
    {
        stea stea_update = SteaService.getStea(id_stea);
        stea_update.setNr_stele(stea.getNr_stele());
        stea_update.setCuloare(stea.getCuloare());
        stea_update.setText(stea.getText());
        SteaService.updateStea(stea_update);
        return "Stea actualizata cu succes";
    }

    @DeleteMapping("/deleteStea-{id_stea}")
    public String deleteStea(@PathVariable("id_stea") int id_stea)
    {
        SteaService.deleteStea(id_stea);
        return "Stea stearsa cu succes";
    }

    @GetMapping("/DTO/{id_stea}")
    public SteaDTO getSteaDTO(@PathVariable("id_stea") int id_stea)
    {
        return SteaService.getSteaDTO(id_stea);
    }

    @GetMapping("/DTO")
    public List<SteaDTO> getSteleDTO()
    {
        return SteaService.getAllSteleDTO();
    }


}
