package _23.client.api.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import _23.client.api.model.Project;

@Path("/project-client-api")
public class ProjectResource {

	@Path("/addProject")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void addProject(Project project){
		System.out.println(project);
	}
}
