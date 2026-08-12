package com.example.product.repository;

import com.example.product.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private Map<Long, Product> products = new HashMap<>();
    private Long sequence = 0L;

    public Product save(Product product) {
        products.put(sequence++, product);
        return product;
    }
}
