package com.example.ecommerce.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="user-session-details")
public class UserSession {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer sessionId;
private String token;
private Integer userId;
private String userType;
private LocalDateTime sessionStartTime;
private LocalDateTime sessionEndTime;
public Integer getSessionId() {
	return sessionId;
}
public void setSessionId(Integer sessionId) {
	this.sessionId = sessionId;
}
public String getToken() {
	return token;
}
public void setToken(String token) {
	this.token = token;
}
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public LocalDateTime getSessionStartTime() {
	return sessionStartTime;
}
public void setSessionStartTime(LocalDateTime sessionStartTime) {
	this.sessionStartTime = sessionStartTime;
}
public LocalDateTime getSessionEndTime() {
	return sessionEndTime;
}
public void setSessionEndTime(LocalDateTime sessionEndTime) {
	this.sessionEndTime = sessionEndTime;
}
public UserSession() {
	super();
	// TODO Auto-generated constructor stub
}





}
// Getters and Setters