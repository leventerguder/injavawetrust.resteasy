package _25.content.negotiation.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _25.content.negotiation.model.Customer;

@Path("/customer-negotiation")
public class CustomerResource {

	@GET
	@Path("/customer")
	@Produces(MediaType.TEXT_HTML)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-negotiation/customer
	public String getCustomerText() {
		System.out.println("getCustomerText is invoked.");
		return new Customer(1, "Levent").toString();
	}

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-negotiation/customer
	public Customer getCustomerJSON() {
		System.out.println("getCustomerJSON is invoked.");
		return new Customer(1, "Levent");
	}

	@GET
	@Path("/customer")
	@Produces(MediaType.APPLICATION_XML)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-negotiation/customer
	public Customer getCustomerXML() {
		System.out.println("getCustomerXML is invoked.");
		return new Customer(1, "Levent");
	}

	@GET
	@Path("/customerXMLOrJSON")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-negotiation/customerXMLOrJSON
	public Customer getCustomerXMLOrJSON() {
		System.out.println("customerXMLOrJSON is invoked.");
		return new Customer(1, "Levent");
	}
}
