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

		String url = "http://localhost:8080/injavawetrust.resteasy.tutorial/library-client-api/authors";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);
		Invocation.Builder invocationBuilder = target.request();
		Response responseList = invocationBuilder.get();
		List<Author> employeeList = responseList.readEntity(new GenericType<List<Author>>(){});
		Response responseXML = invocationBuilder.get();
		System.out.println(employeeList);
		System.out.println(responseXML.readEntity(String.class));

		client.close();
	}
}
