package com.order.management.productservices.controller;

import com.order.management.productservices.entity.Product;
import com.order.management.productservices.service.ProductserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-management/product")
public class ProductController {
    @Autowired
    private ProductserviceImpl productService;
    @PostMapping("")
    public Product postProduct(@RequestBody Product product){
        return productService.postProduct(product);
    }
    @GetMapping("")
    public List<Product> getProduct(){
        return productService.getProduct();
}

}
