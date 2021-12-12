package com.order.management.productservices.service;

import com.order.management.productservices.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    public ProductCategory postProductCategory(ProductCategory productCategory);
    List<ProductCategory> getProductCategory();
    public ProductCategory fetchProductCategoryByName(String productCategoryName);
}
