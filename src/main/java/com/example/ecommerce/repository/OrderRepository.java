package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Customer_Order;

@Repository
public interface OrderRepository extends JpaRepository<Customer_Order, Integer> {
    
    @Query("SELECT o FROM Customer_Order o WHERE o.customer.customerId = :customerId")
    List<Customer_Order> findByCustomerId(@Param("customerId") Integer customerId);
}
