package com.capg.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<ProductsBean> getAllProducts() {
        return service.getAllProducts();
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody ProductsBean product) {
        service.addProduct(product);
    }
}