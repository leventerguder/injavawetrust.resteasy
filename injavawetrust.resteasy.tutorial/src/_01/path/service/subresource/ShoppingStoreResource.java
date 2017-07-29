package _01.path.service.subresource;

import javax.ws.rs.Path;

@Path("/shopping-path")
public class ShoppingStoreResource {

	@Path("/product-subresources")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/shopping-path/product-subresources
	public ProductResource getProductResource() {
		System.out.println("ShoppingStoreResource#getProductResource is called.");
		ProductResource pr = new ProductResource();
		return pr;
	}

	@Path("/address-subresources")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/shopping-path/address-subresources
	public AddressResource getAddress() {
		System.out.println("getAddress is called.");
		AddressResource p = new AddressResource();
		return p;
	}
}
