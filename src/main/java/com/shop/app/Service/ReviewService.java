package com.shop.app.Service;

import com.shop.app.Entity.review;
import com.shop.app.Records.ReviewDTO;

import java.util.List;

public interface ReviewService {
    public String createReview(review review);
    public String updateReview(review review);
    public String deleteReview(int id_review);
    public review getReview(int id_review);
    public List<review> getAllReviews();
    public ReviewDTO getReviewDTO(int id_review);
    public List<ReviewDTO> getAllReviewsDTO();
}
