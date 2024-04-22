package com.shop.app.Mappers;

import com.shop.app.Entity.review;
import com.shop.app.Records.ReviewDTO;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ReviewMapper implements Function <review, ReviewDTO> {
    @Override
     public ReviewDTO apply(review review) {
        return new ReviewDTO(
                review.getId_review(),
                review.getComentariu_review(),
                review.getClient_review().getNume(),
                review.getClient_review().getPrenume(),
                review.getProdus_review().getNume_produs(),
                review.getStea_review().getId_stea()
        );
    }
}
