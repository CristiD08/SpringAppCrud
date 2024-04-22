package com.shop.app.Records;

import java.util.List;

public record ClientDTO(
        String nume,
        String prenume,
        String oras,
        int id_ci,
        List reviews,
        List comenzi


) {
}
