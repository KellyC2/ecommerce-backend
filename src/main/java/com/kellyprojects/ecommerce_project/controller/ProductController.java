package com.kellyprojects.ecommerce_project.controller;

import com.kellyprojects.ecommerce_project.model.Product;
import com.kellyprojects.ecommerce_project.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    private ProductService service;

    public ProductController(ProductService service){
        this.service=service;
    }

    @RequestMapping ("/")
    public String  greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return service.getAllProducts();
    }
}
