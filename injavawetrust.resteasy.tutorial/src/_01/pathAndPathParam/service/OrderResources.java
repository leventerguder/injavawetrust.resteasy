package _01.pathAndPathParam.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/order-uri")
public class OrderResources {

	// "{" variable-name [ ":" regular-expression ] "}"
	
	

	@GET
	@Path("/order/{day}/{month}/{year}")
	public String getOrderHistory(@PathParam("day") int day, @PathParam("month") int month,
			@PathParam("year") int year) {

		String message = "getOrderHistory is called.";
		String date = day + "/" + month + "/" + year;
		return message + " " + date;
	}

	@GET
	@Path("/order/{id : \\d+}")
	public String getOrder(@PathParam("id") int id) {
		String message = "getCustomer int is called.";
		return message + " " + id;
	}
	
	@GET
	@Path("/order/{id : Order-\\d+\\w+}")
	public String getOrderByOrderName(@PathParam("id") String id) {
		String message = "getCustomer int is called.";
		return message + " " + id;
	}
}
