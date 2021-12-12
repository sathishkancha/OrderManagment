package com.order.management.productservices.controller;

import com.order.management.productservices.entity.Product;
import com.order.management.productservices.service.ProductserviceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.order.management.productservices.utills.Constances.PRODUCT_URL;

@RestController
@RequestMapping(PRODUCT_URL)
public class ProductController {
    @Autowired
    private ProductserviceImpl productService;

    private final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @PostMapping("")
    public Product postProduct(@RequestBody Product product){
        logger.info("Post Product method in product controller");
        return productService.postProduct(product);
    }
    @GetMapping("")
    public List<Product> getProduct(){
        logger.info("get Product method in product controller");
        return productService.getProduct();
}

}
