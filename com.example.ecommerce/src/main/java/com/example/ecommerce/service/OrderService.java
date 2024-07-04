
package com.example.ecommerce.service;

import java.util.List;
import com.example.ecommerce.entity.Order;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Integer id);
    List<Order> getOrdersByCustomerId(Integer customerId);
    Order addOrder(Order order);
    Order updateOrder(Integer id, Order order);
    void deleteOrder(Integer id);
}
