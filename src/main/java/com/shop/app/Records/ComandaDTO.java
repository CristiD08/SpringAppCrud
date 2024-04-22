package com.shop.app.Records;

public record ComandaDTO(
        String data_comanda,
        String tip_plata,
        String data_livrare,
        int id_client
) {
}
