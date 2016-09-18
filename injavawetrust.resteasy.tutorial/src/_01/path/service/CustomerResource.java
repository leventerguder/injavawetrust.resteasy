package _01.path.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customer-path")
public class CustomerResource {

	@GET
	public String greeting() {

		String message = "greeting is called.";
		return message;

	}

	// RESTEasy implementation doesn't throw exception for ambiguous @GET method
	// , just warning.
	@GET
	public String greeting2() {

		String message = "greeting is called.";
		return message;

	}

	@POST
	public String greetingForPOST() {

		String message = "greetingForPOST is called.";
		return message;

	}

	@GET
	@Path("/customers")
	public String getAllCustomers() {

		String message = "getAllCustomers is called.";
		return message;

	}

	@GET
	@Path("/vip.customers")
	public String getVIPCustomers() {

		String message = "getVIPCustomers is called.";
		return message;

	}

}
