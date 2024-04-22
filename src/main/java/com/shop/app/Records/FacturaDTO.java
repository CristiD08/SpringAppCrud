package com.shop.app.Records;

public record FacturaDTO(
        int id_factura,
        int id_produs,
        int id_comanda,
        int cantitate
) {
}
