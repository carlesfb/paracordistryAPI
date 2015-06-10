package com.paracordistry.rest;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Track;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.paracordistry.Information;
import com.paracordistry.Product;

/* ENABLE CORS
 * http://enable-cors.org/server_tomcat.html
 */

@Path("/json")
public class JSONService {

	@GET
	@Path("/getProduct")
	@Produces(MediaType.APPLICATION_JSON)
	public Product getProductsInJSON() {
		Product product = new Product();

		Information information = new Information();
		information.setDescription("Una de esas pulseras complicadas pero cuyo resultado es interesante: la pulsera Quasi-Cobbed Solomon Bar.");
		information.setColours("Uno o dos colores.");
		information.setReversible("No es reversible.");
		information.setBuckle("Cierre plástico / nylon.");
		information.setMaterial("paracord 550");
		information.setFlexibility("Muy flexible.");
		
		product.setName("Quasi-Cobbed Solomon Bar");
		product.setInformation(information);
		product.setAdditionalInfo("Este modelo sólo se fabrica por encargo. Ponte en contacto para determinar la talla y los colores que deseas.");
		product.setCode("BP-QUASICOBBED");
		product.setPrice("9.95");
		product.setCategory("Pulseras");
		product.setTags(new String[]{"paracord", "Quasi-Cobbed", "Solomon"});
		product.setImages(new String[]{"images/Quasi-Cobbed-Solomon-PARACORDISTRY.COM01.jpg"});
		
		return product;

	}
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAll() {
		List<Product> products = new ArrayList<Product>();

		Information information = new Information();
		information.setDescription("Una de esas pulseras complicadas pero cuyo resultado es interesante: la pulsera Quasi-Cobbed Solomon Bar.");
		information.setColours("Uno o dos colores.");
		information.setReversible("No es reversible.");
		information.setBuckle("Cierre plástico / nylon.");
		information.setMaterial("paracord 550");
		information.setFlexibility("Muy flexible.");
		
		Product product = new Product();
		product.setName("Quasi-Cobbed Solomon Bar");
		product.setInformation(information);
		product.setAdditionalInfo("Este modelo sólo se fabrica por encargo. Ponte en contacto para determinar la talla y los colores que deseas.");
		product.setCode("BP-QUASICOBBED");
		product.setPrice("9.95");
		product.setCategory("Pulseras");
		product.setTags(new String[]{"paracord", "Quasi-Cobbed", "Solomon"});
		product.setImages(new String[]{"images/Quasi-Cobbed-Solomon-PARACORDISTRY.COM01.jpg"});
		products.add(product);
		
		return products;
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}
	
}