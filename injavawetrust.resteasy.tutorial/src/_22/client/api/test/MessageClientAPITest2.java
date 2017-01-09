package _22.client.api.test;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class MessageClientAPITest2 {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/message-client-api/messages";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Invocation.Builder builder = target.request();

		// way-1
		Response response = builder.get();
		System.out.println(response.readEntity(List.class));

		// way-2
		List<String> resultList = builder.get(new GenericType<List<String>>() {});

		System.out.println(resultList);

		client.close();
	}
}
