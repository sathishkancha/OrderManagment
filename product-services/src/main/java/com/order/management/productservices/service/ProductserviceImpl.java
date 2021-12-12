package com.order.management.productservices.service;

import com.order.management.productservices.entity.Product;
import com.order.management.productservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductserviceImpl {
    @Autowired
    private ProductRepository productRepository;
    public Product postProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProduct() {
        return productRepository.findAll();

    }
}
