package _22.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import _22.client.api.model.Book;

public class LibraryClientAPITest2 {

	public static void main(String[] args) {


		String url = "http://localhost:8080/injavawetrust.resteasy.tutorial/library-client-api/book/100";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);
		Invocation.Builder invocationBuilder = target.request();
		Response response = invocationBuilder.get();

		Book book = response.readEntity(new GenericType<Book>() {});

		System.out.println(response.getStatus());
		System.out.println(book);

		client.close();
	}
}
