//package _14.jaxb.json.service;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//
//import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;
//
//import _14.jaxb.json.model.Address;
//import _14.jaxb.json.model.Customer;
//
//@Path("/customer-json")
//public class CustomerResource {
//
//	@GET
//	@Path("/customer")
//	@Produces("application/json")
//	//@BadgerFish
//	public Customer getCustomer() {
//		Customer customer = new Customer();
//		customer.setId(1);
//		customer.setFirstName("levent");
//		customer.setLastName("erguder");
//
//		Address address = new Address();
//		address.setCity("Istanbul");
//		address.setCountry("Turkey");
//		address.setZip("34000");
//		customer.setAddress(address);
//
//		return customer;
//	}
//}
