package com.kellyprojects.ecommerce_project.service;

import com.kellyprojects.ecommerce_project.model.Product;
import com.kellyprojects.ecommerce_project.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository repository;

    public ProductService(ProductRepository repository){
        this.repository=repository;
    }
    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
        //return repository.findById(id).get();
    }
}
