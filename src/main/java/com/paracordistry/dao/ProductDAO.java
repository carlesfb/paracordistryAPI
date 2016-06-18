package com.paracordistry.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.paracordistry.dto.Product;

public class ProductDAO {
	private String SQL_ALL_PRODUCTS = "SELECT P.PRODUCT_ID AS productId, P.NAME AS name, P.PRICE AS price, I.PATH AS path "
			+ " FROM PRODUCT P INNER JOIN PRODUCT_IMAGES I ON P.PRODUCT_ID = I.PRODUCT_ID";
	
	private String SQL_PRODUCT = "SELECT P.PRODUCT_ID AS productId, P.NAME AS name, P.CODE AS code, "
			+ " P.PRICE AS price, P.CATEGORY AS category, I.PRODUCT_IMAGE_ID AS productImageId, I.PATH AS path "
			+ " FROM PRODUCT P INNER JOIN PRODUCT_IMAGES I ON P.PRODUCT_ID = I.PRODUCT_ID "
			+ " WHERE P.PRODUCT_ID = ? ";
	
	public ArrayList<Product> getProducts(Connection connection) throws Exception {
		ArrayList<Product> products = new ArrayList<Product>();
		
		try {
			PreparedStatement ps = connection.prepareStatement(SQL_ALL_PRODUCTS);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getString("productId"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getString("price"));
				product.setImages(new String[]{rs.getString("path")});
				
				products.add(product);
			}
			
			return products;
		} catch(Exception e) {
			throw e;
		}
	}

	public Product getProductById(Connection connection, String productId) throws Exception {
		Product product = new Product();
		
		try {
			PreparedStatement ps = connection.prepareStatement(SQL_PRODUCT);
			ps.setString(1, productId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				product.setProductId(rs.getString("productId"));
				product.setName(rs.getString("name"));
				product.setCode(rs.getString("code"));
				product.setPrice(rs.getString("price"));
				product.setCategory(rs.getString("category"));
				product.setImages(new String[]{rs.getString("path")});
			}
			
			return product;
		} catch(Exception e){
			throw e;
		}
	}

}
