package org.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicInteger;
@Getter
@Setter
@ToString
@Data
public class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private Integer id;
    private String name;
    private Double cost;

    public Product(String name, Double cost) {
        this.id = count.incrementAndGet();
        this.name = name;
        this.cost = cost;
    }
}
