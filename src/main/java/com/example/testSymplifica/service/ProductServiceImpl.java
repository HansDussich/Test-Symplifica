package com.example.testSymplifica.service;

import com.example.testSymplifica.entity.Product;
import com.example.testSymplifica.repository.OrderRepository;
import com.example.testSymplifica.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;
    private OrderRepository orderRepository;

    public ProductServiceImpl(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Product product) {
        Product product1 = productRepository.save(product);
    }

    @Override
    public void removeProduct(int productId) {
        productRepository.deleteAllById(Collections.singleton(productId));
    }
}
