package _24.client.api.post.xml.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import _24.client.api.post.xml.model.Project;

@Path("/project-client-api")
public class ProjectResource {

	@POST
	@Path("/addProject")
	@Consumes(MediaType.APPLICATION_XML)
	public String addProject(Project project) {
		System.out.println("ProjectResource#addProject");
		System.out.println(project);
		return "addProject#succeed";
	}

	@POST
	@Path("/addProjectBatch")
	@Consumes(MediaType.APPLICATION_XML)
	public String addProjectBatch(List<Project> projectList) {
		System.out.println("ProjectResource#addProjectBatch");
		System.out.println(projectList);
		return "addProjectBatch#succeed";
	}
}
