package _22.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import _22.client.api.model.Author;

public class TestClientAPI5 {

	public static void main(String[] args) {

		String url = "http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/authors";
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target(url);
//		//
//		// Invocation.Builder builder = target.request();
//		// Book response = builder.accept("application/json").get(Book.class);
//		// System.out.println(response);
//
//		Book customer = target.request().get(Book.class);

		//
		// Response response =
		// client.target(url).request().accept("application/json").get();
		// try {
		// if (response.getStatus() == 200) {
		// Book customer = response.readEntity(Book.class);
		// }
		// } finally {
		// response.close();
		// }
//		
//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target(url);
//		 
//		Invocation.Builder invocationBuilder =  target.request();
//		Response response = invocationBuilder.get();
//		 
//		System.out.println(response.readEntity(String.class));
//		 
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);
		 
		Invocation.Builder invocationBuilder =  target.request();
		Response response = invocationBuilder.get();
		 
//		Author employee = response.readEntity(new GenericType<Author>(){});
//		     
//		System.out.println(response.getStatus());
//		System.out.println(employee);
		
		
		System.out.println(response.readEntity(String.class));

		client.close();
	}
}
