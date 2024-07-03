package com.example.ecommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce.entity.Customer_Order;
import com.example.ecommerce.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/allorders")
    public List<Customer_Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer_Order> getOrderById(@PathVariable Integer id) {
        Customer_Order order = orderService.getOrderById(id);
        if (order != null) {
            return ResponseEntity.ok(order);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Customer_Order>> getOrdersByCustomerId(@PathVariable Integer customerId) {
        List<Customer_Order> orders = orderService.getOrdersByCustomerId(customerId);
        if (!orders.isEmpty()) {
            return ResponseEntity.ok(orders);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/create")
    public ResponseEntity<Customer_Order> createOrder(@RequestBody Customer_Order order) {
        try {
            Customer_Order createdOrder = orderService.createOrder(order);
            return ResponseEntity.ok(createdOrder);
        } catch (Exception e) {
            // Log the error
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Customer_Order> updateOrderStatus(@PathVariable Integer id, @RequestBody Customer_Order order) {
        try {
            Customer_Order updatedOrder = orderService.updateOrderStatus(id, order);
            if (updatedOrder != null) {
                return ResponseEntity.ok(updatedOrder);
            }
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            // Log the error
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}

