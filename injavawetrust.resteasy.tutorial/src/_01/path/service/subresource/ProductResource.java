package _01.path.service.subresource;

import javax.ws.rs.GET;

public class ProductResource {

	@GET
	public String getProduct() {
		System.out.println("ProductResource#getProduct is called.");
		return "Macbook Pro";
	}

}
