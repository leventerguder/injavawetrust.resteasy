package _22.client.api.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class ClientService {

	public static void main(String[] args) {
		String url = "http://localhost:8080/injavawetrust.jersey.tutorial/customer-path";

		Client restClient = ClientBuilder.newClient();
		WebTarget target = restClient.target(url);
		WebTarget resourceTarget = target.path("customers"); 
		
		String responseString = resourceTarget.request("text/plain").get(String.class);
		System.out.println("Here is the response: " + responseString);

		// http://howtodoinjava.com/jersey/jersey-restful-client-examples/
		// https://jersey.java.net/documentation/latest/client.html#d0e4161
		// http://howtodoinjava.com/jersey/jersey-restful-client-examples/
		
		restClient.close();

	}
}
