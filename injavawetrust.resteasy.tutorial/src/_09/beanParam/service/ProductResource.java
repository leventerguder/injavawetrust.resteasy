package _09.beanParam.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import _09.beanParam.model.Product;

@Path("/product-beanParam")
public class ProductResource {

	@GET
	@Path("/getProductById/{category}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/product-beanParam/getProductById/computer?id=100
	public String getProductById(@BeanParam Product product) {
		return "getProductById is called. <br/> " + product.toString();
	}

	@GET
	@Path("/getProductsByBrand/{category}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/product-beanParam/getProductsByBrand/computer;brand=acer
	public String getProductsByBrand(@BeanParam Product product) {
		return "getProductsByBrand is called. <br/>" + product.toString();
	}

	@GET
	@Path("/getProductsByCategoryAndBrand/{category}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/product-beanParam/getProductsByCategoryAndBrand/laptop;brand=acer;price=123.45;
	public String getProductsByCategoryAndBrand(@BeanParam Product product) {
		return "getProductsByCategoryAndBrand is called. <br/>" + product.toString();
	}

}
