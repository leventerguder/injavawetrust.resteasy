package _23.client.api.post.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

public class EmployeeClientAPITest2 {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/employee-client-api/addEmployeeForm";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Form form = new Form().param("id", "1").param("name", "Levent").param("surname", "Erguder");

		Response response = target.request().post(Entity.form(form));
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
		client.close();
	}
}
