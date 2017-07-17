package _01.path.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/customer-path")
public class CustomerResource {

	@GET
	//http://localhost:8080/injavawetrust.resteasy.tutorial/customer-path with HTTP GET
	public String greeting() {

		String message = "greeting is called.";
		return message;

	}

	// RESTEasy implementation doesn't throw exception for ambiguous @GET method
	// You can see WARNING on Output console.
	@GET
	public String greeting2() {

		String message = "greeting2 is called.";
		return message;

	}

	@POST
	//http://localhost:8080/injavawetrust.resteasy.tutorial/customer-path with HTTP POST
	public String greetingForPOST() {

		String message = "greetingForPOST is called.";
		return message;

	}

	@GET
	@Path("/customers")
	//http://localhost:8080/injavawetrust.resteasy.tutorial/customer-path/customers
	public String getAllCustomers() {

		String message = "getAllCustomers is called.";
		return message;

	}

	@GET
	@Path("/vip.customers")
	//http://localhost:8080/injavawetrust.resteasy.tutorial/customer-path/vip.customers
	public String getVIPCustomers() {

		String message = "getVIPCustomers is called.";
		return message;

	}

}
