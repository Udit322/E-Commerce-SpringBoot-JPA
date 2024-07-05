package com.example.ecommerce.controller;

import com.example.ecommerce.entity.Wishlist;
import com.example.ecommerce.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {

    @Autowired
    private WishlistService wishlistService;

    @PostMapping("/create")
    public Wishlist addToWishlist(@RequestBody Wishlist wishlist) {
//        return wishlistService.addToWishlist(wishlist);
    
    	   return wishlistService.addToWishlist(wishlist, wishlist.getProduct().getProductId(), wishlist.getCustomer().getCustomerId());}

    @GetMapping("/customer/{customerId}")
    public List<Wishlist> getWishlistByCustomerId(@PathVariable Integer customerId) {
        return wishlistService.getWishlistByCustomerId(customerId);
    }

    @DeleteMapping("/remove/{wishlistId}")
    public void removeFromWishlist(@PathVariable Integer wishlistId) {
        wishlistService.removeFromWishlist(wishlistId);
    }
}
