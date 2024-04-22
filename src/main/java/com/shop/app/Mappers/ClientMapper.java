package com.shop.app.Mappers;

import java.util.function.Function;
import java.util.stream.Collectors;

import com.shop.app.Records.ClientDTO;
import com.shop.app.Entity.clienti;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper implements Function<clienti, ClientDTO> {
    @Override
    public ClientDTO apply(clienti clienti){
        return new ClientDTO(
                clienti.getNume(),
                clienti.getPrenume(),
                clienti.getAdresa().getOras(),
                clienti.getCi().getId_ci(),
                clienti.getReviews()
                        .stream()
                        .map(review -> review.getId_review())
                        .collect(Collectors.toList()),
                clienti.getComenzi()
                        .stream()
                        .map(comanda -> comanda.getId_comanda())
                        .collect(Collectors.toList())


        );
    }

}
