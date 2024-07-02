

package com.example.ecommerce.service;

import com.example.ecommerce.entity.Customer_Order;

import java.util.List;

public interface OrderService {
   Customer_Order  createOrder(Customer_Order order);
    List<Customer_Order> getOrdersByCustomerId(Integer customerId);
   Customer_Order getOrderById(Integer orderId);
    void updateOrderStatus(Integer orderId, String status);
    void deleteOrder(Integer orderId);
    List<Customer_Order> getOrderHistory(Integer customerId); // Add this method
}
