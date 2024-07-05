package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Customer;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.Review;
import com.example.ecommerce.repository.CustomerRepository;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.repository.ReviewRepository;
import com.example.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Review addReview(Review review, Integer productId, Integer customerId) {
//        return reviewRepository.save(review);
    
    	 
    	   
    	        Product product = productRepository.findById(productId)
    	                .orElseThrow(() -> new RuntimeException("Product not found"));
    	        Customer customer = customerRepository.findById(customerId)
    	                .orElseThrow(() -> new RuntimeException("Customer not found"));
    	        review.setProduct(product);
    	        review.setCustomer(customer);
    	        return reviewRepository.save(review);
    	    }

    @Override
    public List<Review> getReviewsByProductId(Integer productId) {
        return reviewRepository.findByProductProductId(productId);
    }
}
