package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageResource {

	@GET
	@Path("/greeting")
	public String getGreeting() {
		System.out.println("MessageResource#getGreeting...");
		return "Hello ! MessageResource#getGreeting is invoked ! ";
	}

	@GET
	@Path("/temp")
	public String getTempMesage() {
		return "This is temporary message !";
	}

}
