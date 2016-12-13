package _20.exception.mapper.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import _19.exception.model.Customer;
import _19.exception.service.CustomerService;

@Path("/customer-exception-mapper")
public class CustomerResource {

	@GET
	@Path("/customer/{id}")
	public Customer getCustomer(@PathParam("id") int id) {

		CustomerService service = new CustomerService();

		Customer customer = service.findCustomer(id);
		if (customer == null) {
			throw new CustomerNotFoundException("customer nt found!");
		}
		return customer;

	}

}
