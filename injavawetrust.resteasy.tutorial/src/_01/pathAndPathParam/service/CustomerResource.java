package _01.pathAndPathParam.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/customer-path")
public class CustomerResource {

	@GET
	public String greeting() {

		String message = "greeting is called.";
		return message;

	}
	
	@POST
	public String greeting2() {

		String message = "greeting is called.";
		return message;

	}

	@GET
	@Path("/customers")
	public String getAllCustomers() {

		String message = "getAllCustomers is called.";
		return message;

	}

	@GET
	@Path("/customer/{id}")
	public String getCustomer(@PathParam("id") String id) {

		String message = "getCustomer is called.";
		return message + " " + id;

	}

	@GET
	@Path("customer/{firstname}-{lastname}")
	public String getCustomer(@PathParam("firstname") String first, @PathParam("lastname") String last) {
		String message = "getCustomer is called.";
		return message + " " + first + " " + last;
	}

}
