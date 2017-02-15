package _23.client.api.post.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

import _23.client.api.post.model.Employee;

public class EmployeeClientApiTest2x {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/employee-client-api/addEmployee";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Entity<Employee> jsonEntity = Entity.json(new Employee(1, "Levent", "Erguder"));

		Form form = new Form().param("id", "1").param("name", "Levent").param("surname", "Erguder");

		Response response = target.request().post(Entity.form(form));
		System.out.println(response);

		//Employee order = response.readEntity(Employee.class);

		//System.out.println(order);
		client.close();
	}
}
