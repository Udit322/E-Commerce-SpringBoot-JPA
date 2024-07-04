package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.entity.Cart;
import com.example.ecommerce.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {
	@Autowired
	private CartService cartService;
	@GetMapping("/all ")
	public List<Cart> getCart() {
		return cartService.getCart();
	}
	@PostMapping("/addcart")
	public Cart addToCart(@RequestBody Cart cart) {
		
		return cartService.addToCart(cart);
	}
		
		
		
	@GetMapping("/{cartId}")
	public Cart getCartById(@PathVariable Integer cartId) {
		
		return cartService.getCartById(cartId);
	}
	
	@DeleteMapping("delete/{cartId}")
	public Cart deleteCartById(@PathVariable Integer cartId) {
		
		return cartService.deleteCart(cartId);
	}	
		
	
		
	}

	


