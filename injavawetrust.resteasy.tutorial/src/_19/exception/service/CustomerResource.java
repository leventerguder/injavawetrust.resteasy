package _19.exception.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import _19.exception.model.Customer;

@Path("/customer-exception")
public class CustomerResource {

	@GET
	@Path("/customer/{id}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-exception/customer/1
	public Customer getCustomer(@PathParam("id") int id) {

		CustomerService service = new CustomerService();

		Customer customer = service.findCustomer(id);
		if (customer == null) {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		return customer;
	}

	@GET
	@Path("/name/{id}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-exception/name/1
	public String getCustomerName(@PathParam("id") int id) {
		System.out.println("getCustomerName is called...");
		throw new WebApplicationException(Response.Status.NOT_IMPLEMENTED);
	}
}
