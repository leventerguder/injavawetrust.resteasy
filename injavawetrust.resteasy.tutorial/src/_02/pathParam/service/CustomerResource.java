package _02.pathParam.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customer-pathParam")
public class CustomerResource {

	@GET
	@Path("/customer/{id}")
	public String getCustomerById(@PathParam("id") String customerId) {

		String message = "getCustomerById is called. Customer Id : " + customerId;
		return message;

	}

	@GET
	@Path("customer/{firstname}-{lastname}")
	public String getCustomerByName(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname) {
		String message = "getCustomerByName is called. Welcome , " + firstname + " " + lastname;
		return message;
	}
}
