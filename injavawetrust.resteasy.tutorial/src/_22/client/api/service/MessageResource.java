package _22.client.api.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/message-client-api")
public class MessageResource {

	@Path("/message")
	@GET
	public String getMessage() {
		String message = "MessageResource#getMessage is called";
		return message;
	}

	@Path("/messages")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> workshops() {
		return Arrays.asList("Message-1", "Message-2", "Message-3");
	}
}
