package com.example.testSymplifica.repository;

import com.example.testSymplifica.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
