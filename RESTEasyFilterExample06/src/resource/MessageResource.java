package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageResource {

	@GET
	@Path("/greeting")

	// http://localhost:8080/RESTEasyFilterExample06/messages/greeting
	public String getGreeting() {
		System.out.println("MessageResource#getGreeting...");
		return "Hello ! MessageResource#getGreeting is invoked ! ";
	}


}
