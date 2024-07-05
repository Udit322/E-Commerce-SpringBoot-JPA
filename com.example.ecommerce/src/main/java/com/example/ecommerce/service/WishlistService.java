package com.example.ecommerce.service;

import com.example.ecommerce.entity.Wishlist;

import java.util.List;

public interface WishlistService {
    Wishlist addToWishlist(Wishlist wishlist, Integer productId, Integer customerId);
    List<Wishlist> getWishlistByCustomerId(Integer customerId);
    void removeFromWishlist(Integer wishlistId);
}
