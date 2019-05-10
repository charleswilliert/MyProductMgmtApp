package edu.mum.cs.cs425.prodmgmt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.cs.cs425.prodmgmt.model.Product;
import edu.mum.cs.cs425.prodmgmt.repository.ProductRepository;

public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> allProduct(){
		
		return this.productRepository.findAll();
	}
	
	public void saveProduct(Product prod) {
		this.productRepository.save(prod);
	}
	
}
