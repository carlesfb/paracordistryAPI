package com.paracordistry.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paracordistry.dao.ProductsDAO;
import com.paracordistry.models.Product;
import com.paracordistry.services.ProductsService;

@Service("productsService")
@Transactional
public class ProductsServiceImpl implements ProductsService{

	@Autowired ProductsDAO productsDAO;
	
	@Override
	public List<Product> findAllProducts() {
		return productsDAO.findAllProducts();
	}

	@Override
	public Product findProductById(String productId) {
		return productsDAO.findProductById(productId);
	}

}
