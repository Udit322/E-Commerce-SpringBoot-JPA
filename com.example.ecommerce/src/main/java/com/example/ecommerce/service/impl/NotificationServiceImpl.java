package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.Notification;
import com.example.ecommerce.repository.NotificationRepository;
import com.example.ecommerce.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> getNotificationsByCustomerId(Integer customerId) {
        return notificationRepository.findByCustomerCustomerId(customerId);
    }
}