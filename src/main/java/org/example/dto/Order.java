package org.example.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
@Getter
@Setter
@ToString
@Data
    public class Order {
        private static final AtomicInteger count = new AtomicInteger(0);
        private Integer id;
        private Timestamp date;
        private Double cost;
        private List<Product> products;

        public Order() {
            this.id = count.incrementAndGet();
        }
    }

