package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
}
