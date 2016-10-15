package _13.jaxb.xml.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _13.jaxb.xml.model.Address;
import _13.jaxb.xml.model.Customer;

@Path("/customer-jaxb-xml")
public class CustomerResource {

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_XML)
	//http://localhost:8080/injavawetrust.resteasy.tutorial/customer-jaxb-xml/customer
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
