package com.paracordistry.services;

import java.util.ArrayList;

import com.paracordistry.models.Product;

public interface ProductsService {

	public ArrayList<Product> getProducts() throws Exception;

	public Product getProductById(String productId) throws Exception;

}