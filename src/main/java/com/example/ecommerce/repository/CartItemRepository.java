package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.entity.Cartitem;

public interface CartItemRepository extends JpaRepository<Cartitem, Integer> {
}
