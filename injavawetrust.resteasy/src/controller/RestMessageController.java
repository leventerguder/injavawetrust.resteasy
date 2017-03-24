package controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class RestMessageController {

	
	// http://localhost:8080/injavawetrust.resteasy/messages/message
	
	// web-mapping-prefix.xml
	// http://localhost:8080/injavawetrust.resteasy/resteasy/messages/message

	// web-filter-dispatcher.xml
	// change file name web-filter-dispatcher.xml to web.xml for testing
	// http://localhost:8080/injavawetrust.resteasy/restfilter/messages/message
	
	@GET
	@Path("/message")
	public String getMessage() {

		String message = "Welcome to injavawetrust.com RESTEasy Tutorial !";
		return message;

	}
}
