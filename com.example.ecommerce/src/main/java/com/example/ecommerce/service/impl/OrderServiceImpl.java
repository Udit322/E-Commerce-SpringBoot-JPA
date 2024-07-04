package com.example.ecommerce.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ecommerce.entity.Order;
import com.example.ecommerce.repository.OrderRepository;
import com.example.ecommerce.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public List<Order> getOrdersByCustomerId(Integer customerId) {
        return orderRepository.findByCustomerCustomerId(customerId);
    }

    @Override
    public Order addOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Integer id, Order order) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            existingOrder.setOrderDate(order.getOrderDate());
            existingOrder.setOrderStatus(order.getOrderStatus());
            existingOrder.setTotal(order.getTotal());
            existingOrder.setCardNumber(order.getCardNumber());
            existingOrder.setCustomer(order.getCustomer());
            existingOrder.setOrderedItems(order.getOrderedItems());
            existingOrder.setOrderAddress(order.getOrderAddress());
            return orderRepository.save(existingOrder);
        }
        return null;
    }

    @Override
    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }
}
