package _23.client.api.post.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import _23.client.api.post.model.Project;

public class ProjectClientApiTest1 {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/project-client-api/addProject";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Entity<Project> xmlEntity = Entity.xml(new Project(1, "IT", "Payment Project"));

		Invocation.Builder builder = target.request();
		Response message = builder.post(xmlEntity);
		System.out.println(message);

		client.close();
	}
}
