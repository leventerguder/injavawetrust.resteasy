package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import resource.filter.Logged;

@Path("/messages")
public class MessageResource {

	@GET
	@Path("/greeting")
	// http://localhost:8080/RESTEasyFilterExample04/messages/greeting
	
	public String getGreeting() {
		System.out.println("MessageResource#getGreeting...");
		return "Hello ! MessageResource#getGreeting is invoked ! ";
	}
	
	@Logged
	@GET
	@Path("/greeting.logged")
	
	// http://localhost:8080/RESTEasyFilterExample04/messages/greeting.logged
	
	public String getGreetingLogged() {
		System.out.println("MessageResource#getGreetingLogged...");
		return "Hello ! MessageResource#getGreetingLogged is invoked ! ";
	}
	
}
