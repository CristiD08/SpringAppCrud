package com.shop.app.Controller;

import com.shop.app.Records.ClientDTO;
import com.shop.app.Entity.clienti;
import com.shop.app.Service.ClientiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/clienti")
public class ClientiController
{

    ClientiService clientiService;

    public ClientiController(ClientiService clientiService) {
        this.clientiService = clientiService;
    }

    @GetMapping("/{id_client}")
    public clienti getClient(@PathVariable("id_client") int id_client)
    {
        return clientiService.getClient(id_client);
    }

    @GetMapping("DTO")
    public List<ClientDTO> getAllClientiDTO()
    {
        return clientiService.getAllClientiDTO();
    }

    @GetMapping("/DTO/{id_client}")
    public ClientDTO getClientDTO(@PathVariable("id_client") int id_client)
    {
        return clientiService.getClientDTO(id_client);
    }

    @GetMapping
    public List<clienti> getAllClienti()
    {
        return clientiService.getAllClienti();
    }

    @GetMapping("/search/{nume}")
    List<ClientDTO> findAllByNumeContaing(@PathVariable("nume") String nume){
        return clientiService.findAllByNumeContaing(nume);
    }

    @PostMapping
    public String createClient(@RequestBody clienti client)
    {
        clientiService.createClient(client);
        return "Client creat cu succes";
    }

    @PutMapping("/update_client/{id_client}")
    public String updateClient(@PathVariable("id_client") int id_client, @RequestBody clienti client)
    {
        clienti client_update = clientiService.getClient(id_client);
        client_update.setNume(client.getNume());
        client_update.setPrenume(client.getPrenume());
        client_update.setCi(client.getCi());
        client_update.setAdresa(client.getAdresa());
        clientiService.updateClient(client_update);
        return "Client actualizat cu succes";
    }


    @DeleteMapping("/deleteClient-{id_client}")
    public String deleteClient(@PathVariable("id_client") int id_client)
    {
        clientiService.deleteClient(id_client);
        return "Client sters cu succes";
    }


}
