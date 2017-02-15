package _23.client.api.post.test;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import _23.client.api.post.model.Project;
import _23.client.api.post.model.ProjectList;

public class ProjectClientApiTest2 {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/injavawetrust.resteasy.tutorial/project-client-api/addProjectBatch";

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(uri);

		List<Project> projects = Arrays.asList(new Project(1, "IT", "Payment Project"),
				new Project(2, "IT", "Security Project"));

		ProjectList projectList = new ProjectList(projects);

		Entity<ProjectList> xmlEntity = Entity.xml(projectList);

		Invocation.Builder builder = target.request();
		Response message = builder.post(xmlEntity);
		System.out.println(message);

		client.close();
	}
}
