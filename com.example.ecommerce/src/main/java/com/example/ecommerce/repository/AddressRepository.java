package com.example.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ecommerce.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
