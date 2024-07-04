package com.example.ecommerce.service;

import com.example.ecommerce.entity.Wishlist;

import java.util.List;

public interface WishlistService {
    Wishlist addToWishlist(Wishlist wishlist);
    List<Wishlist> getWishlistByCustomerId(Integer customerId);
    void removeFromWishlist(Integer wishlistId);
}
