package com.shop.app.Mappers;

import com.shop.app.Entity.factura;
import com.shop.app.Records.FacturaDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class FacturaMapper implements Function<factura, FacturaDTO> {
    @Override
    public FacturaDTO apply(factura factura) {
        return new FacturaDTO(
                factura.getId_factura(),
                factura.getProdus_factura().getId_produs(),
                factura.getComanda_factura().getId_comanda(),
                factura.getCant()
        );
    }
}
