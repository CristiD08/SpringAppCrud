package com.shop.app.Service.Impl;

import com.shop.app.Entity.review;
import com.shop.app.Mappers.ReviewMapper;
import com.shop.app.Records.ReviewDTO;
import com.shop.app.Repository.ReviewRepo;
import com.shop.app.Service.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewImpl implements ReviewService {

    ReviewRepo reviewRepo;
    ReviewMapper reviewMapper;

    public ReviewImpl(ReviewRepo reviewRepo, ReviewMapper reviewMapper) {
        this.reviewRepo = reviewRepo;
        this.reviewMapper = reviewMapper;
    }


    @Override
    public String createReview(review review){
        reviewRepo.save(review);
        return "Ok";
    }

    @Override
    public String updateReview(review review){
        reviewRepo.save(review);
        return "Updated";
    }

    @Override
    public String deleteReview(int id_review){
        reviewRepo.deleteById(id_review);
        return "Deleted";
    }

    @Override
    public review getReview(int id_review) {
        return reviewRepo.findById(id_review).get();
    }

    @Override
    public List<review> getAllReviews() {
        return reviewRepo.findAll();
    }
    @Override
    public ReviewDTO getReviewDTO(int id_review) {
        return reviewRepo.findById(id_review)
                .map(reviewMapper)
                .get();
    }

    @Override
    public List<ReviewDTO> getAllReviewsDTO() {
        return reviewRepo.findAll()
                .stream()
                .map(reviewMapper)
                .collect(Collectors.toList());
    }
}
