package com.order.management.productservices.service;

import com.order.management.productservices.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    public Product postProduct(Product product);
    List<Product> getProduct();
}
