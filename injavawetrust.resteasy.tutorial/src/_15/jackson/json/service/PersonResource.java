package _15.jackson.json.service;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import _15.jackson.json.model.Person;

@Path("/person-json")
public class PersonResource {

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-json/person
	public Person getPerson() {
		Person person = new Person();
		person.setId(1);
		person.setName("Levent");
		person.setSurname("Erguder");
		return person;

	}

	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-json/persons
	public List<Person> getPersons() {
		Person person1 = new Person();
		person1.setId(1);
		person1.setName("Levent");
		person1.setSurname("Erguder");

		Person person2 = new Person();
		person2.setId(2);
		person2.setName("Joshua");
		person2.setSurname("Bloch");

		Person person3 = new Person();
		person3.setId(3);
		person3.setName("James");
		person3.setSurname("Gosling");

		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		return persons;
	}
	
	@GET
	@Path("/personsArray")
	@Produces(MediaType.APPLICATION_JSON)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-json/personsArray
	public Person[] getPersonsArray() {
		Person person1 = new Person();
		person1.setId(1);
		person1.setName("Levent");
		person1.setSurname("Erguder");

		Person person2 = new Person();
		person2.setId(2);
		person2.setName("Joshua");
		person2.setSurname("Bloch");

		Person person3 = new Person();
		person3.setId(3);
		person3.setName("James");
		person3.setSurname("Gosling");

		Person[] persons = new Person[] { person1, person2, person3 };

		return persons;
	}
}
