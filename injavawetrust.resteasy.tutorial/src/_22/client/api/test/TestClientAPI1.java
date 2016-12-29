package _22.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

public class TestClientAPI1 {

	public static void main(String[] args) {

		String url = "http://localhost:8080/injavawetrust.resteasy.tutorial/message-client-api/message";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);

		Invocation.Builder builder = target.request();
		String response = builder.get(String.class);
		System.out.println(response);

		client.close();
	}
}
