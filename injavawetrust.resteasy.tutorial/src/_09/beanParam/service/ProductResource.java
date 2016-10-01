package _09.beanParam.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import _09.beanParam.model.Product;

@Path("/product-beanParam")
public class ProductResource {

	@GET
	@Path("/getProductById/{category : category}")
	// if we use @PathParam , have to declare in path. otherwise we get
	// exception.
	// this is not required for jersey implementation.
	// http://localhost:8080/injavawetrust.resteasy.tutorial/product-beanParam/getProductById/category?id=100
	public String getProductById(@BeanParam Product product) {
		return "getProductById is called. <br/> " + product.toString();
	}

	@GET
	@Path("/getProductsByBrand/{category : category}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/product-beanParam/getProductsByBrand/category;brand=acer
	public String getProductsByBrand(@BeanParam Product product) {
		return "getProductsByBrand is called. <br/>" + product.toString();
	}
	
	@GET
	@Path("/getProductsByCategoryAndBrand/{category}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/product-beanParam/getProductsByCategoryAndBrand/laptop;brand=acer;
	public String getProductsByCategoryAndBrand(@BeanParam Product product) {
		return "getProductsByCategoryAndBrand is called. <br/>" + product.toString();
	}

}
