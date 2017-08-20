package _21.exception.hierarchy.service;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.NotSupportedException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ServiceUnavailableException;

import _19.exception.model.Customer;
import _19.exception.service.CustomerService;

@Path("/customer-exception-hierarchy")
public class CustomerResource {

	@GET
	@Path("/customer/{id}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-exception-hierarchy/customer/1
	public Customer getCustomer(@PathParam("id") int id) {

		System.out.println("getCustomer is called.");

		CustomerService service = new CustomerService();

		Customer customer = service.findCustomer(id);
		if (customer == null) {
			throw new NotFoundException("Customer not found!");
		}
		return customer;

	}

	@GET
	@Path("/name/{id}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-exception-hierarchy/name/1
	public String getCustomerName(@PathParam("id") int id) {
		System.out.println("getCustomerName is called...");
		//
		//
		throw new NotSupportedException();
	}

	@GET
	@Path("/address/{id}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/customer-exception-hierarchy/address/1
	public String getCustomerAddress(@PathParam("id") int id) {
		System.out.println("getCustomerAddress is called...");
		///
		///
		throw new ServiceUnavailableException();
	}

}
