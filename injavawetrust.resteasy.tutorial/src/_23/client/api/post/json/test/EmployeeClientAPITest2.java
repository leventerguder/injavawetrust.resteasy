package _23.client.api.post.json.test;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import _23.client.api.post.json.model.Employee;

public class EmployeeClientAPITest2 {
	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/employee-client-api/addEmployeeBatch";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		List<Employee> employees = Arrays.asList(new Employee(1, "Levent", "Erguder"),
				new Employee(2, "James", "Gosling"));

		Entity<List<Employee>> jsonEntity = Entity.json(employees);

		Invocation.Builder builder = target.request();
		Response message = builder.post(jsonEntity);

		System.out.println("status : " + message.getStatus());
		System.out.println("readEntity: " + message.readEntity(String.class));

		client.close();
	}
}
