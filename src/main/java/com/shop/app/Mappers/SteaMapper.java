package com.shop.app.Mappers;

import com.shop.app.Entity.stea;
import com.shop.app.Records.SteaDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SteaMapper implements Function<stea, SteaDTO> {
    @Override
    public SteaDTO apply(stea stea) {
        return new SteaDTO(
                stea.getId_stea(),
                stea.getNr_stele(),
                stea.getText(),
                stea.getCuloare(),
                stea.getReviews_stele()
                        .stream()
                        .map(review -> review.getId_review())
                        .collect(Collectors.toList())
        );
    }
}
