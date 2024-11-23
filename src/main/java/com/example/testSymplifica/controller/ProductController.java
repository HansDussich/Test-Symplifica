package com.example.testSymplifica.controller;

import com.example.testSymplifica.entity.Product;
import com.example.testSymplifica.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    private String getAllProducts(Model model){
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }

    @GetMapping("/add")
    public String addProductPage(){
        return "products";
    }

    @PostMapping("/add")
    public String addProduct(@ModelAttribute Product product){
        productService.addProduct(product);
        return "redirect:/products";
    }

    @PostMapping("/remove/{id}")
    public String removeProduct(@PathVariable int id){
        productService.removeProduct(id);
        return "redirect:/products";
    }

}
