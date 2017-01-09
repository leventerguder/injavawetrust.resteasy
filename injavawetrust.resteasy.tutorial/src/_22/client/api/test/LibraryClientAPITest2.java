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

		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/library-client-api/book/100";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		Invocation.Builder invocationBuilder = target.request();

		// way1
		Response response = invocationBuilder.get();
		Book book = response.readEntity(Book.class);

		// way2
		Response response2 = invocationBuilder.get();
		Book book2 = response2.readEntity(new GenericType<Book>() {});

		System.out.println("### way1 ###");
		System.out.println(response.getStatus());
		System.out.println(book);
		System.out.println();

		System.out.println("### way2 ###");
		System.out.println(response2.getStatus());
		System.out.println(book2);

		client.close();
	}
}
