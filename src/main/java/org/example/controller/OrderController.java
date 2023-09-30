package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.Order;
import org.example.dto.Product;
import org.example.service.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@Slf4j

public class OrderController {
    private final OrderRepository orderRepository;

    @GetMapping("/{id}")
    public Order getOrderController(@PathVariable("id") Integer id) {
        return orderRepository.getOrder(id);
    }

    @GetMapping("/all")
    public List<Order> getAllOrdersController() {
        return orderRepository.getAllOrders();
    }

    @PostMapping("")
    public boolean addOrderController(@RequestBody List<Product> products) {
        products.forEach(product -> log.info("Add product: " + product.getName() + " " + product.getCost()));
        return orderRepository.addOrder(products);
    }


}
