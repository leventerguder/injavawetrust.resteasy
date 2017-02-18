package _24.client.api.post.xml.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import _24.client.api.post.xml.model.Project;

public class ProjectClientAPITest1 {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/project-client-api/addProject";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		Entity<Project> xmlEntity = Entity.xml(new Project(1, "IT", "Payment Project"));

		Invocation.Builder builder = target.request();
		Response message = builder.post(xmlEntity);

		System.out.println("status : " + message.getStatus());
		System.out.println("readEntity: " + message.readEntity(String.class));

		client.close();
	}
}
