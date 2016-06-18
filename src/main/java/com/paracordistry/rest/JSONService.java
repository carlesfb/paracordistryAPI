package com.paracordistry.rest;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Track;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.paracordistry.dto.Product;
import com.paracordistry.model.ProductManager;

/* ENABLE CORS
 * http://enable-cors.org/server_tomcat.html
 */

@Path("/json")
public class JSONService {

	@GET
	@Path("/getProducts")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAll() {
		List<Product> products = new ArrayList<Product>();

		try {
			ProductManager productManager = new ProductManager();
			products = productManager.getProducts();
			System.out.println(products);
		} catch (Exception e) {
			System.out.println("Exception Error: " + e); 
		}

		return products;
	}
	
	@GET
	@Path("/getProduct/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductById(@PathParam("productId") String productId) {
		Product product = new Product();

		try {
			ProductManager productManager = new ProductManager();
			product = productManager.getProductById(productId);
			System.out.println(product);
		} catch (Exception e) {
			System.out.println("Exception Error: " + e); 
		}

		return product;
 
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
}