package com.order.management.productservices.controller;

import com.order.management.productservices.entity.AllBooksWithCategoryResponce;
import com.order.management.productservices.entity.ProductCategory;
import com.order.management.productservices.service.ProductCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.order.management.productservices.utills.Constances.PRODUCT_CATEGORY_URL;


@RestController
@RequestMapping(PRODUCT_CATEGORY_URL)
public class ProductCategoryController {
    @Autowired
    ProductCategoryServiceImpl productCategoryService;
    @PostMapping("")
    public ProductCategory postProductCategory(@RequestBody ProductCategory category ){
        return productCategoryService.postProductCategory(category);
    }
    @GetMapping("")
    public List<ProductCategory> getProductCategory(){
        return productCategoryService.getProductCategory();
    }
    @GetMapping("/name/{name}")
    public ProductCategory fetchProductCategoryByName(@PathVariable("name") String productCategoryName){
        return productCategoryService.fetchProductCategoryByName(productCategoryName);
    }
    @GetMapping("/allproductbycateory/{name}")
    public AllBooksWithCategoryResponce fetchProductByCategory(@PathVariable("name") String pcname){
        return productCategoryService.fetchProductByCategory(pcname);
    }
}