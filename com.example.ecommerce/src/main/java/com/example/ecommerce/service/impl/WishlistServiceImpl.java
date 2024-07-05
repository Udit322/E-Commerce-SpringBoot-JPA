package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Customer;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.Wishlist;
import com.example.ecommerce.repository.CustomerRepository;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.repository.WishlistRepository;
import com.example.ecommerce.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistServiceImpl implements WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;
    @Autowired
    private ProductRepository productRepository;
    

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Wishlist addToWishlist(Wishlist wishlist, Integer productId, Integer customerId) {
//        return wishlistRepository.save(wishlist);
    	  Product product = productRepository.findById(productId)
                  .orElseThrow(() -> new RuntimeException("Product not found"));
          Customer customer = customerRepository.findById(customerId)
                  .orElseThrow(() -> new RuntimeException("Customer not found"));
          wishlist.setProduct(product);
          wishlist.setCustomer(customer);
          return wishlistRepository.save(wishlist);
    }

    @Override
    public List<Wishlist> getWishlistByCustomerId(Integer customerId) {
        return wishlistRepository.findByCustomerCustomerId(customerId);
    }

    @Override
    public void removeFromWishlist(Integer wishlistId) {
        wishlistRepository.deleteById(wishlistId);
    }
}
