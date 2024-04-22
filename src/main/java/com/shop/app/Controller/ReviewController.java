package com.shop.app.Controller;

import com.shop.app.Entity.review;
import com.shop.app.Records.ReviewDTO;
import com.shop.app.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/review")
public class ReviewController
{

    ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/{id_review}")
    public review getReviewInfo(@PathVariable("id_review") int id_review)
    {
        return reviewService.getReview(id_review);
    }

    @GetMapping
    public List<review> getReviewsInfo()
    {
        return  reviewService.getAllReviews() ;
    }

    @PostMapping
    public String createReview(@RequestBody review review){
        reviewService.createReview(review);
        return "Review creat cu succes";
    }

    @PutMapping("/update_review/{id_review}")
    public  String UpdateReview(@PathVariable("id_review") int id_review, @RequestBody review review)
    {
        review review_update = reviewService.getReview(id_review);
        review_update.setComentariu_review(review.getComentariu_review());
        review_update.setClient_review(review.getClient_review());
        review_update.setStea_review(review.getStea_review());
        review_update.setProdus_review(review.getProdus_review());
        reviewService.updateReview(review_update);
        return "Review actualizat cu succes";
    }

    @DeleteMapping("/deleteReview-{id_review}")
    public String deleteReview(@PathVariable("id_review") int id_review)
    {
        reviewService.deleteReview(id_review);
        return "Review sters cu succes";
    }

    @GetMapping("/DTO/{id_review}")
    public ReviewDTO getReviewDTO(@PathVariable("id_review") int id_review)
    {
        return reviewService.getReviewDTO(id_review);
    }

    @GetMapping("/DTO")
    public List<ReviewDTO> getReviewsDTO()
    {
        return  reviewService.getAllReviewsDTO() ;
    }


}
