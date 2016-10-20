package _15.jackson.json.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _15.jackson.json.model.Address;
import _15.jackson.json.model.Customer;

@Path("/customer-json")
public class CustomerResource {

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_JSON)
	//http://localhost:8080/injavawetrust.jersey.tutorial/customer-json/customer
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("levent");
		customer.setLastName("erguder");

		Address address = new Address();
		address.setCity("Istanbul");
		address.setCountry("Turkey");
		address.setZip("34000");
		customer.setAddress(address);

		return customer;
	}
}
