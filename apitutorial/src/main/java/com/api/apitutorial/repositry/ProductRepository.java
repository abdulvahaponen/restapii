package com.api.apitutorial.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apitutorial.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
//Product findProductByName(String name);
}
