package com.order.management.productservices.controller;

import com.order.management.productservices.entity.Product;
import com.order.management.productservices.service.ProductserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductserviceImpl productService;
    @PostMapping("/post")
    public Product postProduct(@RequestBody Product product){
        return productService.postProduct(product);
    }
@GetMapping("/get")
    public List<Product> getProduct(){
        return productService.getProduct();
}

}
