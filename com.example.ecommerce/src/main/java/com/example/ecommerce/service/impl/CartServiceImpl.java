package com.example.ecommerce.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.entity.Cart;
import com.example.ecommerce.repository.CartRepository;
import com.example.ecommerce.service.CartService;

@Service
public class CartServiceImpl implements CartService {
  @Autowired
	CartRepository cartRepository ;

@Override
public List<Cart> getCart() {
	
	return cartRepository.findAll();
}

@Override
public Cart addToCart(Cart cart) {
	return cartRepository.save(cart);
	
}

//@Override
//public void removeFromCart(Long customerId, Long productId) {
//	// TODO Auto-generated method stub
//	
//}
//
//@Override
//public void updateCartQuantity(Long customerId, Long productId, Integer quantity) {
//	// TODO Auto-generated method stub
//	
//}

@Override
public Cart deleteCart(Integer cartId){
	cartRepository.deleteById(cartId);
	return null;
	
}

@SuppressWarnings("deprecation")
@Override
public Cart getCartById(Integer cartId) {
	
	return cartRepository.getById(cartId);
}
	
    
  }
	

