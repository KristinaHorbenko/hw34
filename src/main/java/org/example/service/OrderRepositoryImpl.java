package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.Order;
import org.example.dto.Product;
import org.example.exception.OrderNotFoundException;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class OrderRepositoryImpl implements OrderRepository{
    private List<Order> orderList;

    public OrderRepositoryImpl() {
        orderList = new ArrayList<>();
    }

    @Override
    public Order getOrder(Integer id) {
        for (Order order : orderList) {
            if (order.getId().equals(id)) return order;
        }
        log.info("Id not found...");
        throw new OrderNotFoundException("Id not found");
    }

    @Override
    public List<Order> getAllOrders() {
        return orderList;
    }



    @Override
    public boolean addOrder(List<Product> products) {
        Order order = new Order();
        order.setDate(new Timestamp(System.currentTimeMillis()));
        order.setProducts(products);
        order.setCost(order.getProducts().stream().mapToDouble(Product::getCost).sum());
        return orderList.add(order);
    }
}

