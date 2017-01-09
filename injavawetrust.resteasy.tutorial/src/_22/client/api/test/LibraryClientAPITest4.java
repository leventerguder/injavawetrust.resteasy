package _22.client.api.test;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import _22.client.api.model.Author;

public class LibraryClientAPITest4 {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/library-client-api/authors";
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		Invocation.Builder invocationBuilder = target.request();

		// way1
		Response response = invocationBuilder.get();
		List<Author> authorList = response.readEntity(new GenericType<List<Author>>() {});

		// way2
		Response response2 = invocationBuilder.get();
		String xmlResponseString = response2.readEntity(String.class);

		System.out.println("### way1 ###");
		System.out.println(authorList);

		System.out.println("### way2 ###");
		System.out.println(xmlResponseString);

		client.close();
	}
}
