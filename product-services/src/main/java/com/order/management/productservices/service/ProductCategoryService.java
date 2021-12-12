package com.order.management.productservices.service;

import com.order.management.productservices.entity.AllBooksWithCategoryResponce;
import com.order.management.productservices.entity.ProductCategory;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ProductCategoryService {
    public ProductCategory postProductCategory(ProductCategory productCategory);
    List<ProductCategory> getProductCategory();
    public ProductCategory fetchProductCategoryByName(String productCategoryName);
    public AllBooksWithCategoryResponce fetchProductByCategory(String pcname);
}
