package _23.client.api.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import _23.client.api.model.Project;

public class ProjectClientApiTest1 {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/project-client-api/addProject";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Entity<Project> jsonEntity = Entity.xml(new Project(1, "IT", "CRM Project"));

		Invocation.Builder builder = target.request();
		Response message = builder.post(jsonEntity);
		System.out.println(message);

		client.close();
	}
}
