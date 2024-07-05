package com.example.ecommerce.service;

import com.example.ecommerce.entity.Notification;

import java.util.List;

public interface NotificationService {
    Notification createNotification(Notification notification);
    List<Notification> getNotificationsByCustomerId(Integer customerId);
}
