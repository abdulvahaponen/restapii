package com.api.apitutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.apitutorial.model.Product;
import com.api.apitutorial.service.ProductService;

@RestController
public class ProductController {
@Autowired
private ProductService productService;
@PostMapping("/saveProduct")
  public Product saveProduct(@RequestBody Product product) {
	  return productService.saveProduct(product);
  }
@GetMapping("/products")
public List<Product> findAllProduct(){
	return productService.getProducts();
}
@GetMapping("/product/{id}")
public Product findProductByID(@PathVariable int productId) {
	return productService.getProductById(productId);
}
/*
@GetMapping("/product/{name}")
public Product findProductByName(@PathVariable String productName) {
	return productService.getProductByName(productName);
}
*/
@PutMapping("/update")
public Product updateProduct(@RequestBody Product product) {
	  return productService.updateProduct(product);
}
@DeleteMapping("/deleteProduct/{id}")
public String deleteProduct(@PathVariable int productId) {
 return	productService.deleteProduct(productId);
}
}
