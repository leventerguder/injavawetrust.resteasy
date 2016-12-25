package _02.pathParam.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customer-pathParam")
public class CustomerResource {

	@GET
	@Path("/customer/{id}")
	//http://localhost:8080/injavawetrust.resteasy.tutorial/customer-pathParam/customer/100
	public String getCustomerById(@PathParam("id") String customerId) {

		String message = "getCustomerById is called. Customer Id : " + customerId;
		return message;

	}

	@GET
	@Path("customer/{firstname}-{lastname}")
	//http://localhost:8080/injavawetrust.resteasy.tutorial/customer-pathParam/customer/levent-erguder
	public String getCustomerByName(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname) {
		String message = "getCustomerByName is called. Welcome , " + firstname + " " + lastname;
		return message;
	}
}
