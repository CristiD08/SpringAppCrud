package com.shop.app.Mappers;

import com.shop.app.Entity.produs;
import com.shop.app.Records.ProdusDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProdusMapper implements Function<produs, ProdusDTO> {
    @Override
    public ProdusDTO apply(produs produs) {
        return new ProdusDTO(
                produs.getId_produs(),
                produs.getNume_produs(),
                produs.getPret_produs(),
                produs.getDesc_produs(),
                produs.getProdus_reviews()
                        .stream()
                        .map(review -> review.getId_review())
                        .collect(Collectors.toList()),
                produs.getProdus_facturi()
                        .stream()
                        .map(factura -> factura.getId_factura())
                        .collect(Collectors.toList())
        );
    }
}
