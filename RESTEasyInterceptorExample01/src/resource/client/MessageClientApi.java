package resource.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;

public class MessageClientApi {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/RESTEasyInterceptorExample01/messages/greeting");
		String response = target.request().post(Entity.text("message-content"), String.class);
		System.out.println(response);
	}
}
