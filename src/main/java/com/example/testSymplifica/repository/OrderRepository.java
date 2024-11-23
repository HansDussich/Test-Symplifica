package com.example.testSymplifica.repository;

import com.example.testSymplifica.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
