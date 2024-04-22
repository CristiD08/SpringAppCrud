package com.shop.app.Records;

import java.util.List;

public record SteaDTO(
         int id_stea,
         int nr_stele,
         String text,
         String culoare,
         List reviews
) {
}
