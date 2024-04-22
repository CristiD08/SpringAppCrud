package com.shop.app.Service.Impl;

import com.shop.app.Entity.produs;
import com.shop.app.Mappers.ProdusMapper;
import com.shop.app.Records.ProdusDTO;
import com.shop.app.Repository.ProdusRepo;
import com.shop.app.Service.ProdusService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdusImpl implements ProdusService {

    ProdusRepo produsRepo;
    ProdusMapper produsMapper;

    public ProdusImpl(ProdusRepo produsRepo, ProdusMapper produsMapper) {
        this.produsRepo = produsRepo;
        this.produsMapper = produsMapper;
    }

    @Override
    public String createProdus(produs produs){
        produsRepo.save(produs);
        return "Ok";
    }

    @Override
    public String updateProdus(produs produs){
        produsRepo.save(produs);
        return "Updated";
    }

    @Override
    public String deleteProdus(int id_produs){
        produsRepo.deleteById(id_produs);
        return "Deleted";
    }

    @Override
    public produs getProdus(int id_produs){
        return produsRepo.findById(id_produs).get();
    }

    @Override
    public List<produs> getAllProduse(){
        return produsRepo.findAll();
    }

    @Override
    public ProdusDTO getProdusDTO(int id_produs){
        return produsRepo.findById(id_produs)
                .map(produsMapper)
                .get();
    }

    @Override
    public List<ProdusDTO> getAllProduseDTO(){
        return produsRepo.findAll()
                .stream()
                .map(produsMapper)
                .collect(Collectors.toList());
    }

}
