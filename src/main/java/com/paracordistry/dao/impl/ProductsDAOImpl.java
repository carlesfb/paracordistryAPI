package com.paracordistry.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.paracordistry.dao.AbstractDAO;
import com.paracordistry.dao.ProductsDAO;
import com.paracordistry.models.Product;

@Repository("productsDAO")
public class ProductsDAOImpl extends AbstractDAO implements ProductsDAO {
	
	private String SQL_ALL_PRODUCTS = "SELECT P.PRODUCT_ID AS productId, P.NAME AS name, P.PRICE AS price, I.PATH AS path "
			+ " FROM PRODUCT P INNER JOIN PRODUCT_IMAGES I ON P.PRODUCT_ID = I.PRODUCT_ID";
	
	private String SQL_PRODUCT = "SELECT P.PRODUCT_ID AS productId, P.NAME AS name, P.CODE AS code, "
			+ " P.PRICE AS price, P.CATEGORY AS category, I.PRODUCT_IMAGE_ID AS productImageId, I.PATH AS path "
			+ " FROM PRODUCT P INNER JOIN PRODUCT_IMAGES I ON P.PRODUCT_ID = I.PRODUCT_ID "
			+ " WHERE P.PRODUCT_ID = ? ";
	
	@SuppressWarnings("unchecked")
	public List<Product> findAllProducts(){
		Criteria criteria = getSession().createCriteria(Product.class);
		
		return (List<Product>) criteria.list();
	}
	
	public Product findProductById(String productId){
		Criteria criteria = getSession().createCriteria(Product.class);
		criteria.add(Restrictions.eq("productId", productId));
		
		return (Product) criteria.uniqueResult();
	}
	
}
