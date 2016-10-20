package _16.jettison.json.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _16.jettison.json.model.Product;

@Path("/product-jettison-json")
public class ProductResource {

	@GET
	@Path("/product")
	@Produces(MediaType.APPLICATION_JSON)
	//@BadgerFish
	//http://localhost:8080/injavawetrust.resteasy.tutorial/product-jettison-json/product	
	public Product getProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("K-360");
		product.setBrand("Logitech");
		product.setPrice(99.99);
		product.setCategory("Keyboard");
		return product;
	}
}
