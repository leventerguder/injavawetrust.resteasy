package _02.pathParam.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/order-pathParam")
public class OrderResource {

	@GET
	@Path("/order/{day}/{month}/{year}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/order-pathParam/order/20/09/2016
	public String getOrdersByHistory(@PathParam("day") int day, @PathParam("month") int month,
			@PathParam("year") int year) {

		String message = "getOrdersByHistory is called. ";
		String date = day + "." + month + "." + year;
		return message + " " + date;
	}

	@GET
	@Path("/order/{id : \\d+}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/order-pathParam/order/5000

	// not called
	// http://localhost:8080/injavawetrust.resteasy.tutorial/order-pathParam/order/invalidNumeric
	public String getOrderById(@PathParam("id") int id) {
		String message = "getOrderById int is called. Order Id : " + id;
		return message;
	}

	@GET
	@Path("/order/{name : Order-\\d+\\w+}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/order-pathParam/order/Order-1000Abc
	public String getOrderByOrderName(@PathParam("name") String orderName) {
		String message = "getOrderByOrderName int is called. Order Name : " + orderName;
		return message;
	}
}
