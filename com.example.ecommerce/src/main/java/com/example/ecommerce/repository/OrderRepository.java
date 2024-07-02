package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.entity.Customer_Order;

public interface OrderRepository extends JpaRepository<Customer_Order, Integer> {
}
