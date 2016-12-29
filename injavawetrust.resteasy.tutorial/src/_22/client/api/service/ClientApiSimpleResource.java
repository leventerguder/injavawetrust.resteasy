package _22.client.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/client-api")
public class ClientApiSimpleResource {



	@GET
	@Path("/book")
	// http://localhost:8080/injavawetrust.jersey.tutorial/library-queryParam/book?id=10
	public String getBookById(@QueryParam("id") int id) {
		String message = "getBookById is called." + " Id : " + id;
		return message;

	}

	@Path("/responseMessage")
	@GET
	// http://localhost:8080/injavawetrust.jersey.tutorial/client-api/responseMessage
	public Response getResponseMessage() {
		String message = "ClientApiSimpleResource#getResponseMessage";
		ResponseBuilder builder = Response.ok(message);
		return builder.build();
	}

	@Path("/postMessage")
	@POST
	public void postMessage(String name) {
		System.out.println("#postMessage");
		System.out.println(name);
	}
}
