package com.order.management.productservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllBooksWithCategoryResponce {
    private ProductCategory category;
    private List<Product> product;

}
