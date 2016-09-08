package com.paracordistry.services;

import java.util.List;

import com.paracordistry.models.Product;

public interface ProductsService {

	public List<Product> findAllProducts();

	public Product findProductById(String productId);

}