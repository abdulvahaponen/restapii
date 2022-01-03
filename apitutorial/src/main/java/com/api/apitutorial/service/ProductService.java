package com.api.apitutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apitutorial.model.Product;
import com.api.apitutorial.repositry.ProductRepository;

@Service
public class ProductService {
	@Autowired
   private ProductRepository productRepository;
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	public Product getProductById(int productId) {
	return	productRepository.findById(productId).orElse(null);
	}
/*	
	public Product getProductByName(String name) {
		return	productRepository.findProductByName(name);
		}
		*/
	public String deleteProduct(int productId) {
		productRepository.deleteById(productId);
         return "product removed!! "+productId;
	}
	public Product updateProduct(Product product) {
		Product existingProduct=productRepository.findById(product.getId()).orElse(null);
	          existingProduct.setAd(product.getAd());
	          existingProduct.setAdet(product.getAdet());
	          existingProduct.setFiyat(product.getFiyat());
	          return productRepository.save(existingProduct);
	          
	}
}
