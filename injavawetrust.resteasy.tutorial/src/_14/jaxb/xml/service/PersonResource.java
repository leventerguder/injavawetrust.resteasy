package _14.jaxb.xml.service;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.jboss.resteasy.annotations.providers.jaxb.Wrapped;

import _14.jaxb.xml.model.Person;

@Path("/person-jaxb-xml")
public class PersonResource {

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_XML)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-jaxb-xml/person
	public Person getPerson() {
		Person person = new Person();
		person.setId(1);
		person.setName("Levent");
		person.setSurname("Erguder");
		return person;

	}

	@GET
	@Path("/personWithJAXBContext")
	@Produces(MediaType.APPLICATION_XML)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-jaxb-xml/personWithJAXBContext
	public String getPersonWithJAXBContext() throws JAXBException {

		Person person = new Person();
		person.setId(1);
		person.setName("Levent");
		person.setSurname("Erguder");

		JAXBContext ctx = JAXBContext.newInstance(Person.class);
		StringWriter writer = new StringWriter();
		ctx.createMarshaller().marshal(person, writer);

		return writer.toString();
	}

	@GET
	@Path("/persons")
	@Produces(MediaType.APPLICATION_XML)
	@Wrapped(element="list", namespace="http://foo.org", prefix="foo")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-jaxb-xml/persons
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
	@Produces(MediaType.APPLICATION_XML)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/person-jaxb-xml/personsArray
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
