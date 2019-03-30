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

		response.bufferEntity();

		@SuppressWarnings("unchecked")
		List<String> resultList1 = response.readEntity(List.class);

		// If we didn’t buffer the entity, the second readEntity() call would result in
		// an IllegalStateException.
		String resultJSON = response.readEntity(String.class);

		// way-2
		// Invoke HTTP GET method for the current request synchronously.
		List<String> resultList2 = builder.get(new GenericType<List<String>>() {
		});
		
		@SuppressWarnings("unchecked")
		List<String> resultList3 = builder.get(List.class);

		System.out.println("### way1 ###");
		System.out.println(resultList1);
		System.out.println(resultJSON);

		System.out.println("### way2 ###");
		System.out.println(resultList2);
		
		System.out.println("### way3 ###");
		System.out.println(resultList3);

		response.close();
		client.close();
	}
}
