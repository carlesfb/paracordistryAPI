package com.paracordistry.dao;

import java.util.List;

import com.paracordistry.models.Product;

public interface ProductsDAO {
	
	public List<Product> findAllProducts();

	public Product findProductById(String productId);
	
}
