package _22.client.api.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class ClientService2 {

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/injavawetrust.jersey.tutorial/client-api/book";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);
		
		Invocation.Builder builder = target.request(MediaType.TEXT_PLAIN);
		String response = builder.get(String.class);
		System.out.println(response);
	
	
		client.close();
		//
		// String url2 =
		// "http://localhost:8080/injavawetrust.jersey.tutorial/client-api/responseMessage";
		// Client client2 = ClientBuilder.newClient();
		// WebTarget target2 = client2.target(url2);
		// Response response2 = target2.request().get(Response.class);
		// System.out.println(response2.readEntity(String.class));

		// http://localhost:8080/injavawetrust.jersey.tutorial/customer-exception/name/1

		// Client client3 = ClientBuilder.newClient();
		// WebTarget webTarget =
		// client3.target("http://localhost:8080/JerseyDemos/rest").path("employees");
		//
		// Invocation.Builder invocationBuilder =
		// webTarget.request(MediaType.APPLICATION_XML);
		// Response response3 = invocationBuilder.get();
		//
		// System.out.println(response3.readEntity(Object.class));
	}
}
