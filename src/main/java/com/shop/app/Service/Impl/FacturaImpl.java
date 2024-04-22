package com.shop.app.Service.Impl;

import com.shop.app.Entity.factura;
import com.shop.app.Mappers.FacturaMapper;
import com.shop.app.Records.FacturaDTO;
import com.shop.app.Repository.FacturaRepo;
import com.shop.app.Service.FacturaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacturaImpl implements FacturaService {

    FacturaRepo facturaRepo;
    FacturaMapper facturaMapper;


    public FacturaImpl(FacturaRepo facturaRepo, FacturaMapper facturaMapper) {
        this.facturaRepo = facturaRepo;
        this.facturaMapper = facturaMapper;
    }


    @Override
    public String createFactura(factura factura) {
        facturaRepo.save(factura);
        return "Ok";
    }

    @Override
    public String updateFactura(factura factura){
        facturaRepo.save(factura);
        return "Updated";
    }

    @Override
    public String deleteFactura(int id_factura) {
        facturaRepo.deleteById(id_factura);
        return "Deleted";
    }

    @Override
    public factura getFactura(int id_factura) {
        return facturaRepo.findById(id_factura).get();
    }

    @Override
    public List<factura> getAllFacturi() {
        return facturaRepo.findAll();
    }

    @Override
    public FacturaDTO getFacturaDTO(int id_factura) {
        return facturaRepo.findById(id_factura)
                .map(facturaMapper)
                .get();
    }

    @Override
    public List<FacturaDTO> getAllFacturiDTO() {
        return facturaRepo.findAll()
                .stream()
                .map(facturaMapper)
                .collect(Collectors.toList());

    }
}
