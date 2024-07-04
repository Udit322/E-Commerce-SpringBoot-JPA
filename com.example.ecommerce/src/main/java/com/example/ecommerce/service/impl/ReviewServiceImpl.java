package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Review;
import com.example.ecommerce.repository.ReviewRepository;
import com.example.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getReviewsByProductId(Integer productId) {
        return reviewRepository.findByProductProductId(productId);
    }
}