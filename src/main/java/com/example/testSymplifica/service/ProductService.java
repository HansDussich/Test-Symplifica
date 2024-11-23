package com.example.testSymplifica.service;

import com.example.testSymplifica.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    void addProduct(Product product);
    void removeProduct(int productId);

}
