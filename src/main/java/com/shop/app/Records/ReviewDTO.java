package com.shop.app.Records;

public record ReviewDTO(
        int id_review,
        String comentariu_review,
        String nume_client,
        String prenume_client,
        String nume_produs,
        int id_stea
) {
}
