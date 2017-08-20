package _24.client.api.post.xml.test;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import _24.client.api.post.xml.model.Project;

public class ProjectClientAPITest2 {

	public static void main(String[] args) {
		
		String uri = "http://localhost:8080/injavawetrust.jersey.tutorial/project-client-api/addProjectBatch";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		List<Project> projects = Arrays.asList(new Project(1, "IT", "Payment Project"),
				new Project(2, "IT", "Security Project"));

		GenericEntity<List<Project>> projectEntityList = new GenericEntity<List<Project>>(projects) {};

		Entity<GenericEntity<List<Project>>> xmlEntity = Entity.xml(projectEntityList);

		Invocation.Builder builder = target.request();
		Response message = builder.post(xmlEntity);

		System.out.println("status : " + message.getStatus());
		System.out.println("readEntity: " + message.readEntity(String.class));

		client.close();
	}
}
