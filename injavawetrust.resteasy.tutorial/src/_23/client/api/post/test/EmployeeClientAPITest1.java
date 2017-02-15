package _23.client.api.post.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import _23.client.api.post.model.Employee;

public class EmployeeClientAPITest1 {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/employee-client-api/addEmployee";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Entity<Employee> jsonEntity = Entity.json(new Employee(1, "Levent", "Erguder"));

		// valid too
		// Entity<Employee> jsonEntity = Entity.entity(new Employee(1, "Levent",
		// "Erguder"),MediaType.APPLICATION_JSON);

		Invocation.Builder builder = target.request();
		Response message = builder.post(jsonEntity);

		System.out.println(message.getStatus());
		System.out.println(message.readEntity(String.class));

		client.close();
	}
}
