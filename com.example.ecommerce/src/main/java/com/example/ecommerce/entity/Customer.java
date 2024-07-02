package com.example.ecommerce.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Customer {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer customerId;
private String firstName;
private String lastName;
private String mobileNo;
private String emailId;
private String password;
private LocalDateTime createdOn;

private String cardNumber;
public Integer getCustomerId() {
	return customerId;
}

public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getMobileNo() {
	return mobileNo;
}

public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public LocalDateTime getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(LocalDateTime createdOn) {
	this.createdOn = createdOn;
}

public String getCardNumber() {
	return cardNumber;
}

public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}

public Map<String, Address> getAddresses() {
	return addresses;
}

public void setAddresses(Map<String, Address> addresses) {
	this.addresses = addresses;
}

public List<Order> getOrders() {
	return orders;
}

public void setOrders(List<Order> orders) {
	this.orders = orders;
}

public Cart getCustomerCart() {
	return customerCart;
}

public void setCustomerCart(Cart customerCart) {
	this.customerCart = customerCart;
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

@ElementCollection
@CollectionTable(name = "customer_address", joinColumns = @JoinColumn(name = "customer_id"))
@MapKeyColumn(name = "address_type")
private Map<String, Address> addresses;

@OneToMany(mappedBy = "customer")
private List<Order> orders;

@OneToOne(mappedBy = "customer")
private Cart customerCart;
}