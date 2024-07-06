
package com.example.ecommerce.service;

import java.util.List;
import java.util.Optional;



import com.example.ecommerce.entity.Customer_Order;


public interface OrderService {
    Customer_Order createOrder(Customer_Order order);
    List<Customer_Order> getAllOrders();
    Customer_Order getOrderById(Integer orderId);
    List<Customer_Order> getOrdersByCustomerId(Integer customerId);
    Customer_Order updateOrderStatus(Integer orderId, Customer_Order order);
    void deleteOrder(Integer orderId);
    Optional<Customer_Order> getOrderHistory(Integer customerId);
}
