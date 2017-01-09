package _22.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

public class MessageClientAPITest1 {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/message-client-api/message";
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Invocation.Builder builder = target.request();
		String message = builder.get(String.class);
		System.out.println(message);

		client.close();
	}
}
