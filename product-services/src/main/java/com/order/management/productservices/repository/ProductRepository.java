package com.order.management.productservices.repository;

import com.order.management.productservices.entity.Product;
import com.order.management.productservices.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findByCategoryIgnoreCase(String category);
}
