package _26.uriBuilder.service;

import javax.ws.rs.Path;

@Path("/customer-uriBuilder")
public class CustomerResource {

	@Path("/customer")
	public String getCustomer() {
		return "CustomerResource#getCustomer";
	}
}
