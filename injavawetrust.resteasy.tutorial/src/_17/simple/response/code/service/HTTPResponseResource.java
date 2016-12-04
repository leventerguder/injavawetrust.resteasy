package _17.simple.response.code.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path(value = "/http-response")
public class HTTPResponseResource {

	@GET
	@Path("/response200")
	// HTTP Response Code : 200
	// http://localhost:8080/injavawetrust.resteasy.tutorial/http-response/response200
	public String response200() {
		String message = "response200 is called.";
		return message;
	}

	@GET
	@Path("/responseNull")
	// HTTP Response Code : 204
	// http://localhost:8080/injavawetrust.resteasy.tutorial/http-response/responseNull
	public String responseNull() {
		System.out.println("responseNull is called.");
		return null;
	}

	@DELETE
	@Path("/person/{id}")
	// HTTP Response Code : 204
	// Send HTTP DELETE

	// void return type is meaningful for delete , update methods.

	// http://localhost:8080/injavawetrust.resteasy.tutorial/http-response/person/1
	public void delete(@PathParam("id") int id) {
		System.out.println("Person is deleted...");
	}

	@POST
	@Path("/response405")
	// send with HTTP GET
	// HTTP Response Code : 405
	// HTTP Status 405 - Method Not Allowed

	// http://localhost:8080/injavawetrust.jersey.tutorial/http-response/response405
	public String response405() {
		String message = "response405 is called.";
		return message;
	}

}
