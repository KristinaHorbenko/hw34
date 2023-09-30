package org.example.service;

import org.example.dto.Order;
import org.example.dto.Product;

import java.util.List;

public interface OrderRepository {
    Order getOrder(Integer id);
    List<Order> getAllOrders();
    boolean addOrder(List<Product> products);

}
