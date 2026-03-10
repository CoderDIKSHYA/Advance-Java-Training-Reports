package com.springcore;

public class ProductServiceImpl implements ProductService {

    private String product;   // Step-8 / Step-16

    // Step-6 : Default Constructor
    public ProductServiceImpl() {
        System.out.println("Default Constructor Called");
    }

    // One Parameter Constructor (Constructor Injection)
    public ProductServiceImpl(String product) {
        this.product = product;
    }

    // Setter Method (Setter Injection)
    public void setProduct(String product) {
        this.product = product;
    }

    // Business Method
    @Override
    public void allProducts() {
        System.out.println("Product Name is : " + product);
    }
}
