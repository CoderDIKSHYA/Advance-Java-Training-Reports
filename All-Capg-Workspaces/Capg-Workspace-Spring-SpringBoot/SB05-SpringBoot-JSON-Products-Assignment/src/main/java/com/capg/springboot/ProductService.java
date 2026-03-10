package com.capg.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private List<ProductsBean> products = new ArrayList<>(Arrays.asList(
            new ProductsBean(1, "Laptop", 65000),
            new ProductsBean(2, "Mobile", 25000),
            new ProductsBean(3, "Headphones", 2000)
    ));

    public List<ProductsBean> getAllProducts() {
        return products;
    }

    public void addProduct(ProductsBean product) {
        products.add(product);
    }
}