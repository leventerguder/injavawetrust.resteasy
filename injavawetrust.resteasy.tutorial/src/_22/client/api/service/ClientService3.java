package _22.client.api.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientService3 {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		// WebTarget target =
		// client.target("http://localhost:8080/injavawetrust.jersey.tutorial/client-api/message");
		//
		// System.out.println(target.request().get());

		String url = "http://localhost:8080/injavawetrust.jersey.tutorial/client-api/postMessage";
		WebTarget target = client.target(url);
		Response response = target.request().post(null);
		
		System.out.println(response.getEntity());
	}
}
