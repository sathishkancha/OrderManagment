package com.order.management.productservices.repository;

import com.order.management.productservices.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
 public ProductCategory findByproductCategoryName(String productCategoryName);
    public ProductCategory findByproductCategoryNameIgnoreCase(String productCategoryName);
}
