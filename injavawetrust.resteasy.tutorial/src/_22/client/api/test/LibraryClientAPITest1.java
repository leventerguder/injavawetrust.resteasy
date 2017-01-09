package _22.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class LibraryClientAPITest1 {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/library-client-api/welcome";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);
		Invocation.Builder invocationBuilder = target.request();

		// way1
		Response response = invocationBuilder.get();
		String message = response.readEntity(String.class);

		System.out.println("### way1 ###");
		System.out.println("Response Status:" + response.getStatus());
		System.out.println(message);
		System.out.println();

		// way2
		String message2 = invocationBuilder.get(String.class);

		System.out.println("### way2 ###");
		System.out.println("Response Status:" + response.getStatus());
		System.out.println(message2);

		client.close();
	}
}
