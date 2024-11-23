package com.example.testSymplifica.controller;

import com.example.testSymplifica.service.OrderService;
import com.example.testSymplifica.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;
    private ProductService productService;

    public OrderController(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }

    @GetMapping
        public String getAllOrders(Model model){
        model.addAttribute("orders", orderService.getOrders());
        model.addAttribute("orders", productService.getAllProducts());
        return "orders";
    }

    @PostMapping("/generate")
    public String generateOrder(@RequestParam(required = false) Integer productId, Model model){
        if (productId == null){
            model.addAttribute("errorMessage", "Product ID is required");
            model.addAttribute("orders", orderService.getOrders());
            model.addAttribute("product", productService.getAllProducts());
            return "orders";
        }
        orderService.generateOrder(productId);
        return "redirect:/orders";
    }

    @PostMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable Integer id){
        orderService.deleteOrder(id);
        return "redirect:/orders";
    }

}
