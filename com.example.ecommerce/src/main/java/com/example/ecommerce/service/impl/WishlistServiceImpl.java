package com.example.ecommerce.serviceimpl;

import com.example.ecommerce.entity.Wishlist;
import com.example.ecommerce.repository.WishlistRepository;
import com.example.ecommerce.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistServiceImpl implements WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    @Override
    public Wishlist addToWishlist(Wishlist wishlist) {
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