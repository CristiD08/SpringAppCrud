package com.shop.app.Mappers;

import com.shop.app.Entity.comanda;
import com.shop.app.Records.ComandaDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ComandaMapper implements Function<comanda, ComandaDTO> {
    @Override
    public ComandaDTO apply(comanda comanda) {
        return new ComandaDTO(
                comanda.getData_comanda(),
                comanda.getTip_plata(),
                comanda.getData_livrare(),
                comanda.getClient_comanda().getId_client()

        );
    }
}
