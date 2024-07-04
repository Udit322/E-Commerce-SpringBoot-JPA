package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Customer_Order;
import com.example.ecommerce.entity.OrderStatus;
import com.example.ecommerce.repository.OrderRepository;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Customer_Order createOrder(Customer_Order order) {
        order.setPaymentMethod("COD"); // Set a default payment method
        order.setOrderStatus(order.getOrderStatus()); // Set initial status
        return orderRepository.save(order);
    }

    @Override
    public List<Customer_Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Customer_Order getOrderById(Integer orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    @Override
    public List<Customer_Order> getOrdersByCustomerId(Integer customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    @Override
    public Customer_Order updateOrderStatus(Integer orderId, Customer_Order order) {
        Customer_Order existingOrder = orderRepository.findById(orderId).orElse(null);
        if (existingOrder != null) {
            existingOrder.setOrderStatus(order.getOrderStatus());
            existingOrder.setPaymentMethod(order.getPaymentMethod());
            // Update other fields as necessary
            return orderRepository.save(existingOrder);
        }
        return null;
    }

    @Override
    public void deleteOrder(Integer orderId) {
        orderRepository.deleteById(orderId);
    }

    @Override
    public Optional<Customer_Order> getOrderHistory(Integer customerId) {
        return orderRepository.findById(customerId);
    }
}
