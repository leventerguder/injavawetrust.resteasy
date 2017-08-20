package _06.formParam.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.jboss.resteasy.annotations.Form;

import _06.formParam.model.Person;

@Path("/person-formParam")
public class PersonResource {

	@POST
	@Path("/addPerson")
	public String addPerson(@FormParam("name") String name, @FormParam("surname") String surname) {
		String message = "addPerson is called. " + "Welcome , " + name + " " + surname;
		return message;
	}

	@POST
	@Path("/addPersonModel")
	public String addPersonModel(@Form Person person) {
		String message = "addPersonModel is called.";
		return message + " " + person.toString();
	}

}