package com.example.ecommerce.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "addressdetails")
public class Address {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer addressId;
private String streetNo;
private String buildingName;
private String locality;
private String city;
private String state;
private String pincode;
public Integer getAddressId() {
	return addressId;
}



public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}



public String getStreetNo() {
	return streetNo;
}



public void setStreetNo(String streetNo) {
	this.streetNo = streetNo;
}



public String getBuildingName() {
	return buildingName;
}



public void setBuildingName(String buildingName) {
	this.buildingName = buildingName;
}



public String getLocality() {
	return locality;
}



public void setLocality(String locality) {
	this.locality = locality;
}



public String getCity() {
	return city;
}



public void setCity(String city) {
	this.city = city;
}



public String getState() {
	return state;
}



public void setState(String state) {
	this.state = state;
}



public String getPincode() {
	return pincode;
}



public void setPincode(String pincode) {
	this.pincode = pincode;
}



public Customer getCustomer() {
	return customer;
}



public void setCustomer(Customer customer) {
	this.customer = customer;
}


public Address() {
	super();
	// TODO Auto-generated constructor stub
}


@ManyToOne
@JoinColumn(name = "customer_id")
private Customer customer;
}