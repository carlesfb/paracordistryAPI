package com.paracordistry.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.paracordistry.models.Product;

public interface ProductsDAO {
	
	public ArrayList<Product> getProducts(Connection connection) throws Exception;

	public Product getProductById(Connection connection, String productId) throws Exception;}
