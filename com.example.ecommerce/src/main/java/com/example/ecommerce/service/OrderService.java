

package com.example.ecommerce.service;

import com.example.ecommerce.entity.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);
    List<Order> getOrdersByCustomerId(Integer customerId);
    Order getOrderById(Integer orderId);
    void updateOrderStatus(Integer orderId, String status);
    void deleteOrder(Integer orderId);
    List<Order> getOrderHistory(Integer customerId); // Add this method
}
