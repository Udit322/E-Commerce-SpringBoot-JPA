package com.example.ecommerce.service;

import com.example.ecommerce.entity.Review;

import java.util.List;

public interface ReviewService {
    Review addReview(Review review, Integer productId, Integer customerId);
    List<Review> getReviewsByProductId(Integer productId);
}
