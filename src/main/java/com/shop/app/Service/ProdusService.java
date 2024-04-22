package com.shop.app.Service;

import com.shop.app.Entity.produs;
import com.shop.app.Records.ProdusDTO;

import java.util.List;

public interface ProdusService {
    public String createProdus(produs produs);
    public String updateProdus(produs produs);
    public String deleteProdus(int id_produs);
    public produs getProdus(int id_produs);
    public List<produs> getAllProduse();
    public ProdusDTO getProdusDTO(int id_produs);
    public List<ProdusDTO> getAllProduseDTO();
}
