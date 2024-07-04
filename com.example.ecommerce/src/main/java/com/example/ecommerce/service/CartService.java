
package com.example.ecommerce.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.ecommerce.entity.Cart;

public interface CartService {

    List<Cart> getCart();

   Cart addToCart(Cart cart);
   ResponseEntity<Cart> getCartById(Integer cartId);
//    void removeFromCart(Long customerId, Long productId);
//
//    void updateCartQuantity(Long customerId, Long productId, Integer quantity);

    ResponseEntity<Cart> deleteCartById(Integer cartId);
}
