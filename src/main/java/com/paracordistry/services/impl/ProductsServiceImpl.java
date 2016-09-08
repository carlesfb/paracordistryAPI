package com.paracordistry.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paracordistry.connection.ConnectionDB;
import com.paracordistry.dao.ProductsDAO;
import com.paracordistry.models.Product;
import com.paracordistry.services.ProductsService;

@Service("productsService")
public class ProductsServiceImpl implements ProductsService{

	@Autowired ProductsDAO productsDAO;
	
	@Override
	public ArrayList<Product> getProducts() throws Exception {
		return productsDAO.getProducts(ConnectionDB.getConnection());
	}

	@Override
	public Product getProductById(String productId) throws Exception {
		return productsDAO.getProductById(ConnectionDB.getConnection(), productId);
	}

}
