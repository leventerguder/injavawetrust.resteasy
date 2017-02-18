package _24.client.api.post.xml.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import _24.client.api.post.xml.model.Project;
import _24.client.api.post.xml.model.ProjectList;

@Path("/project-client-api")
public class ProjectResource {

	@Path("/addProject")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public String addProject(Project project) {
		System.out.println("ProjectResource#addProject");
		System.out.println(project);
		return "addProject#succeed";
	}

	@Path("/addProjectBatch")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public String addProjectBatch(ProjectList projectList) {
		System.out.println("ProjectResource#addProject");
		System.out.println(projectList);
		return "addProject#succeed";
	}
}
