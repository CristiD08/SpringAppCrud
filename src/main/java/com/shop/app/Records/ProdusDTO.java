package com.shop.app.Records;

import java.util.List;

public record ProdusDTO(
         int id_produs,
         String nume_produs,
         Double pret_produs,
         String desc_produs,
         List reviews,
         List facturi

) {
}
