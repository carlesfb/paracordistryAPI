package com.paracordistry.model;

import java.sql.Connection;
import java.util.ArrayList;

import com.paracordistry.dao.ConnectionDB;
import com.paracordistry.dao.ProductDAO;
import com.paracordistry.dto.Product;

public class ProductManager {

	public ArrayList<Product> getProducts() throws Exception {
		ArrayList<Product> products = null;
		
		try {
			Connection connection;
			connection = ConnectionDB.getConnection();
	     
	        if(connection != null) {
	            System.out.println("Conexión Realizada Correctamente");
	        }
	        
			ProductDAO productDAO = new ProductDAO();
	        products = productDAO.getProducts(connection);
	        
		} catch (Exception e) {
			throw e;
		}
		
		return products;
	}

	public Product getProductById(String productId) throws Exception {
		Product product = null;

		try {
			Connection connection;
			connection = ConnectionDB.getConnection();
	     
	        if(connection != null) {
	            System.out.println("Conexión Realizada Correctamente");
	        }
	        
			ProductDAO productDAO = new ProductDAO();
	        product = productDAO.getProductById(connection, productId);
	        
		} catch (Exception e) {
			throw e;
		}
		
		return product;
	}

}