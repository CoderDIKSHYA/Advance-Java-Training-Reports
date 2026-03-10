package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductClient {

    // Step 1
    public static void main(String[] args) {

        // Step 2: Load Spring Container
        ClassPathXmlApplicationContext factory =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // Step 3: Get first bean (Constructor Injection)
        ProductService p1 =
                (ProductService) factory.getBean("productService1");

        // Step 9: Call method
        p1.allProducts();

        // Step 11: Get second bean (Setter Injection)
        ProductService p2 =
                (ProductService) factory.getBean("productService2");

        // Step 17: Call method
        p2.allProducts();

        // Step 19-20: Close container
        factory.close();
    }
}
