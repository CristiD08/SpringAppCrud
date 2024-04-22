package com.shop.app.Controller;


import com.shop.app.Entity.factura;
import com.shop.app.Records.FacturaDTO;
import com.shop.app.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/shop/factura"})
public class FacturaController
{

    FacturaService facturaService;


    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @GetMapping("/{id_factura}")
    public factura getfacturaInfo(@PathVariable("id_factura") int id_factura)
    {
        return facturaService.getFactura(id_factura);
    }

    @GetMapping
    public List<factura> getAllfactura()
    {
        return facturaService.getAllFacturi();
    }

    @PostMapping
    public String createFactura(@RequestBody factura factura)
    {
        facturaService.createFactura(factura);
        return "Factura creata cu succes";
    }

    @PutMapping("/update_factura/{id_factura}")
    public String updateFactura(@PathVariable("id_factura") int id_factura, @RequestBody factura factura)
    {
        factura factura_update = facturaService.getFactura(id_factura);
        factura_update.setComanda_factura(factura.getComanda_factura());
        factura_update.setProdus_factura(factura.getProdus_factura());
        factura_update.setCant(factura.getCant());
        facturaService.updateFactura(factura_update);
        return "Factura atualizata cu succes";
    }

    @DeleteMapping("/deleteFactura-{id_factura}")
    public String deleteFactura(@PathVariable("id_factura")  int id_factura)
    {
        facturaService.deleteFactura(id_factura);
        return "Factura stearsa cu succes";
    }

    @GetMapping("/DTO/{id_factura}")
    public FacturaDTO getfacturaDTO(@PathVariable("id_factura") int id_factura)
    {
        return facturaService.getFacturaDTO(id_factura);
    }

    @GetMapping("/DTO")
    public List<FacturaDTO> getAllfacturiDTO()
    {
        return facturaService.getAllFacturiDTO();
    }

}

