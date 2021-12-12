package com.order.management.productservices.service;

import com.order.management.productservices.entity.ProductCategory;
import com.order.management.productservices.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;
    public ProductCategory postProductCategory(ProductCategory category) {
        return  productCategoryRepository.save(category);
    }
    public List<ProductCategory> getProductCategory(){
        return productCategoryRepository.findAll();
    }

    public ProductCategory fetchProductCategoryByName(String productCategoryName) {
        return productCategoryRepository.findByproductCategoryNameIgnoreCase(productCategoryName);
    }
}
