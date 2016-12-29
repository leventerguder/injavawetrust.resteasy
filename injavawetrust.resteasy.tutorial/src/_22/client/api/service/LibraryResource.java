package _22.client.api.service;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import _22.client.api.model.Author;
import _22.client.api.model.Book;

@Path("/library-client-api")
public class LibraryResource {

	@GET
	@Path("/book")
	@Produces(MediaType.APPLICATION_JSON)
	//// http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/book
	public Response getBookById() {
		System.out.println("Hebele");
		Book book = new Book("aaa", "Huzursuzluğun Kitabı", 550, 23.72);
		ResponseBuilder builder = Response.ok(book);
		return builder.build();
	}

	@GET
	@Path("/author")
	@Produces(MediaType.APPLICATION_XML)
	//// http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/author
	public Response getAuthor() {
		Author author = new Author("1", "hebele", "hubele", "turkey");
		ResponseBuilder builder = Response.ok(author);
		return builder.build();
	}

	@GET
	@Path("/authors")
	@Produces(MediaType.APPLICATION_XML)
	//// http://localhost:8080/injavawetrust.jersey.tutorial/library-client-api/authors
	public List<Author> getAuthors() {
		Author author = new Author("1", "hebele", "hubele", "turkey");
		Author author2 = new Author("2", "hebele2", "hubele2", "turkey");
		return Arrays.asList(author, author2);
	}
}
