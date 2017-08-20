package _18.complex.response.service;

import java.util.Arrays;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import _18.complex.response.model.Person;

@Path("/person-response")
public class PersonResource {

	@GET
	@Path("/name")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-response/name
	public Response getPersonNameById() {
		String personName = "Levent";
		ResponseBuilder builder = Response.ok(personName);
		// add header
		builder.header("myHeader", "myHeaderValue");
		// add cookie
		builder.cookie(new NewCookie("myCookie", "myCookieValue"));
		return builder.build();

	}

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-response/person
	public Response getPersonById() {
		Person person = new Person(100, "Levent", "Erguder");
		ResponseBuilder builder = Response.ok(person);
		return builder.build();
	}

	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-response/persons
	public Response getAllPersons() {

		Person person1 = new Person(100, "Levent", "Erguder");
		Person person2 = new Person(101, "James", "Gosling");
		Person person3 = new Person(102, "Joshua", "Bloch");

		List<Person> persons = Arrays.asList(person1, person2, person3);

		// GenericEntity<List<Person>> genericEntity = new GenericEntity<List<Person>>(persons) {};
		// return Response.ok(genericEntity).build();
		
		return Response.ok(persons).build();
	}
}
