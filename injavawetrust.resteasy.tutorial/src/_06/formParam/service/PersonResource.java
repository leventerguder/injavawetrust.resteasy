package _06.formParam.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/person-pathParam")
public class PersonResource {

	@POST
	@Path("/addPerson")
	public String addPerson(@FormParam("name") String name, @FormParam("surname") String surname) {
		String message = "addPerson is called. " + "Welcome , " + name + " " + surname;
		return message;
	}
}
