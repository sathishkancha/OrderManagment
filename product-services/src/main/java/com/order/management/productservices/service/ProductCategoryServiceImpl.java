package com.order.management.productservices.service;

import com.order.management.productservices.entity.AllBooksWithCategoryResponce;
import com.order.management.productservices.entity.Product;
import com.order.management.productservices.entity.ProductCategory;
import com.order.management.productservices.repository.ProductCategoryRepository;
import com.order.management.productservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Autowired
    ProductRepository productRepository;

    public ProductCategory postProductCategory(ProductCategory category) {
        return  productCategoryRepository.save(category);
    }
    public List<ProductCategory> getProductCategory(){
        return productCategoryRepository.findAll();
    }

    public ProductCategory fetchProductCategoryByName(String productCategoryName) {
        return productCategoryRepository.findByproductCategoryNameIgnoreCase(productCategoryName);
    }

    @Override
    public AllBooksWithCategoryResponce fetchProductByCategory(String pcname) {
        AllBooksWithCategoryResponce allBooksWithCategoryResponce=new AllBooksWithCategoryResponce();
        ProductCategory pc = productCategoryRepository.findByproductCategoryNameIgnoreCase(pcname);
        allBooksWithCategoryResponce.setCategory(pc);
        List<Product> lp = productRepository.findByCategoryIgnoreCase(pcname);
        allBooksWithCategoryResponce.setProduct(lp);
        return allBooksWithCategoryResponce;
    }
}
