package _14.jettison.json.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

import _14.jettison.json.model.Product;

@Path("/product-jettison-json")
public class ProductResource {

	@GET
	@Path("/product")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/injavawetrust.resteasy.tutorial/product-jettison-json/product
	@BadgerFish
	public Product getProduct() {
		Product product = new Product();
		product.setId(1);
		product.setName("K-360");
		product.setBrand("Logitech");
		product.setPrice(99.99);
		return product;
	}
}
