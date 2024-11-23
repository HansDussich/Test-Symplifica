package com.example.testSymplifica.service;

import com.example.testSymplifica.entity.Order;

import java.util.List;

public interface OrderService {
    void generateOrder(Integer productId);
    List<Order> getOrders();
    void deleteOrder(Integer orderId);
}
