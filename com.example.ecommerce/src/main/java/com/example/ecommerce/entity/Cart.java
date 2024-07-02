package com.example.ecommerce.entity;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Cart {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;

    @OneToMany
    private List<Cartitem> cartItems;

    private Double cartTotal;

    @OneToOne
    private Customer customer;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public List<Cartitem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Cartitem> cartItems) {
		this.cartItems = cartItems;
	}

	public Double getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Getters and Setters
	
}
