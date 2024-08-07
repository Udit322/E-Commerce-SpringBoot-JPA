package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Review;
import com.example.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/create")
    public Review addReview( @RequestBody Review review) {
//        return reviewService.addReview(review);
    	return reviewService.addReview(review, review.getProduct().getProductId(), review.getCustomer().getCustomerId());
    }

    @GetMapping("/product/{productId}")
    public List<Review> getReviewsByProductId(@PathVariable Integer productId) {
        return reviewService.getReviewsByProductId(productId);
    }
}
