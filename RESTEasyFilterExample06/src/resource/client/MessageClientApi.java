package resource.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import resource.filter.LogClientFilter;

public class MessageClientApi {

	public static void main(String[] args) {

		// we have to register filter manually on the client side.
		Client client = ClientBuilder.newBuilder().register(new LogClientFilter()).build();

		WebTarget target = client.target("http://localhost:8080/RESTEasyFilterExample06/messages/greeting");

		String message = target.request().get(String.class);
		System.out.println(message);

		client.close();
	}
}
