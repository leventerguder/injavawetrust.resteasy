package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class RestMessageController {

	@GET
	@Path("/message")
	public String getMessage() {

		String message = "Welcome to injavawetrust.com RESTEasy Tutorial !";
		return message;

	}
}
