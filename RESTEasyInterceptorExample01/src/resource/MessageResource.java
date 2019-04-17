package resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageResource {

	@POST
	@Path("/greeting")

	public String postGreeting(String entity) {
		//System.out.println("MessageResource#postGreeting... : " + entity);
		return "Hello ! MessageResource#postGreeting is invoked ! " + entity;
	}

}
