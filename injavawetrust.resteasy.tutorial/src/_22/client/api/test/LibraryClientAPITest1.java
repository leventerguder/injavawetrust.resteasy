package _22.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class LibraryClientAPITest1 {

	public static void main(String[] args) {

		String url = "http://localhost:8080/injavawetrust.resteasy.tutorial/library-client-api/welcome";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);
		Invocation.Builder invocationBuilder = target.request();
		Response response = invocationBuilder.get();

		String message = response.readEntity(String.class);

		System.out.println("Response Status:" + response.getStatus());
		System.out.println(message);

		client.close();
	}
}
