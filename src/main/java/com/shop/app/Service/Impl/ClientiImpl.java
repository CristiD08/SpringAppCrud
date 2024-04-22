package com.shop.app.Service.Impl;

import com.shop.app.Records.ClientDTO;
import com.shop.app.Mappers.ClientMapper;
import com.shop.app.Entity.clienti;
import com.shop.app.Repository.ClientiRepo;
import com.shop.app.Service.ClientiService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientiImpl implements ClientiService {

    ClientiRepo clientiRepo;
    ClientMapper clientMapper;

    public ClientiImpl(ClientiRepo clientiRepo, ClientMapper clientMapper) {
        this.clientiRepo = clientiRepo;
        this.clientMapper = clientMapper;
    }



    @Override
    public String createClient(clienti clienti){
        clientiRepo.save(clienti);
        return "Ok";
    }

    @Override
    public String updateClient(clienti clienti){
        clientiRepo.save(clienti);
        return "Updated";
    }

    @Override
    public String deleteClient(int id_client){
        clientiRepo.deleteById(id_client);
        return "Deleted";
    }

    @Override
    public clienti getClient(int id_client){
        return clientiRepo.findById(id_client).get();
    }

    @Override
    public List<clienti> getAllClienti(){
        return clientiRepo.findAll();
    }
    @Override
    public ClientDTO getClientDTO(int id_client){
        return clientiRepo.findById(id_client)
                .map(clientMapper)
                .get();

    }

    @Override
    public List<ClientDTO> getAllClientiDTO(){
        return clientiRepo.findAll()
                .stream()
                .map(clientMapper)
                .collect(Collectors.toList());
    }
    @Override
    public List<ClientDTO> findAllByNumeContaing(String nume){
        return clientiRepo.findAllByNumeContaining(nume)
                .stream()
                .map(clientMapper)
                .collect(Collectors.toList());
    }

}
