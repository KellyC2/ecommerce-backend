package com.kellyprojects.ecommerce_project.repository;

import com.kellyprojects.ecommerce_project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
