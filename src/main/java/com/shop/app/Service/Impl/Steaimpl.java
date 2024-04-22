package com.shop.app.Service.Impl;

import com.shop.app.Entity.stea;
import com.shop.app.Mappers.SteaMapper;
import com.shop.app.Records.SteaDTO;
import com.shop.app.Repository.SteaRepo;
import com.shop.app.Service.SteaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Steaimpl implements SteaService {

    SteaRepo steaRepo;
    SteaMapper steaMapper;

    public Steaimpl(SteaRepo steaRepo, SteaMapper steaMapper) {
        this.steaRepo = steaRepo;
        this.steaMapper = steaMapper;
    }

    @Override
    public String createStea(stea stea) {
        steaRepo.save(stea);
        return "Ok";
    }

    @Override
    public String updateStea(stea stea) {
        steaRepo.save(stea);
        return "Updated";
    }

    @Override
    public String deleteStea(int id_stea) {
        steaRepo.deleteById(id_stea);
        return "Deleted";
    }

    @Override
    public stea getStea(int id_stea) {

        return steaRepo.findById(id_stea).get();
    }

    @Override
    public List<stea> getAllStele() {
        return steaRepo.findAll();
    }

    @Override
    public SteaDTO getSteaDTO(int id_stea) {

        return steaRepo.findById(id_stea)
                .map(steaMapper)
                .get();
    }

    @Override
    public List<SteaDTO> getAllSteleDTO() {
        return steaRepo.findAll()
                .stream()
                .map(steaMapper)
                .collect(Collectors.toList());
    }
}
