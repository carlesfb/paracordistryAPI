package com.paracordistry.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paracordistry.models.Product;
import com.paracordistry.services.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsRestController {

	@Autowired ProductsService productsService;
	
    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public  @ResponseBody List<Product> getProducts() {
    	List<Product> products = new ArrayList<Product>();
    	
    	try {
			products = productsService.getProducts();
			System.out.println(products);
		} catch (Exception e) {
			System.out.println("Exception Error: " + e);
		}
    	
		return products;
    }
    
    @RequestMapping(value = {"/{productId}"}, method = RequestMethod.GET)
    public  @ResponseBody Product getProductById(@PathVariable String productId) {
    	Product product = new Product();

		try {
			product = productsService.getProductById(productId);
			System.out.println(product);
		} catch (Exception e) {
			System.out.println("Exception Error: " + e); 
		}

		return product;
    }
	
}