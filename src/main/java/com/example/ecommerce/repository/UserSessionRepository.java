package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.entity.UserSession;

public interface UserSessionRepository extends JpaRepository<UserSession, Integer> {
}
