package com.shop.app.Service.Impl;

import com.shop.app.Repository.CiRepo;
import com.shop.app.Service.CiService;
import com.shop.app.Entity.ci;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiImpl implements CiService {

    CiRepo ciRepo;

    public CiImpl(CiRepo ciRepo) {
        this.ciRepo = ciRepo;
    }

    @Override
    public String createCi(ci ci){
        ciRepo.save(ci);
        return "ok";
    }

    @Override
    public String updateCi(ci ci){
        ciRepo.save(ci);
        return "Updated";
    }

    @Override
    public String deleteCi(int id_ci){
        ciRepo.deleteById(id_ci);
        return "Deleted";
    }

    @Override
    public ci getCi(int id_ci){
        return ciRepo.findById(id_ci).get();
    }

    @Override
    public List<ci> getAllCi(){
        return ciRepo.findAll();
    }
}
