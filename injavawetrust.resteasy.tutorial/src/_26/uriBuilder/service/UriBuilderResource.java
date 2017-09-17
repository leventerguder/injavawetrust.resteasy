package _26.uriBuilder.service;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.UriBuilder;

@Path("/uriBuilder-path")
public class UriBuilderResource {

	@GET
	@Path("/test1")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/uriBuilder-path/test1
	public String test1UriBuilder() {

		UriBuilder builder = UriBuilder.fromPath("/customers/{id}");
		builder.scheme("http")
		.host("example.com")
		.resolveTemplate("id", "100")
		.queryParam("myParam", "myValue");

		URI uri = builder.build();
		return uri.toString();
	}

	@GET
	@Path("/test2")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/uriBuilder-path/test2
	public String test2UriBuilder() {

		UriBuilder builder = UriBuilder.fromPath("/customers/{id}");
		builder.scheme("http")
		.host("{hostname}")
		.queryParam("{queryParam}", "{queryValue}");

		URI uri = builder.build("example.com", "100", "myParam", "myValue");
		return uri.toString();
	}

	@GET
	@Path("/test3")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/uriBuilder-path/test3
	public String test3UriBuilder() {

		UriBuilder builder = UriBuilder.fromPath("/customers/{id}");
		builder.scheme("http")
		.host("{hostname}")
		.queryParam("{queryParam}", "{queryValue}");

		Map<String, String> map = new HashMap<String, String>();
		map.put("hostname", "example.com");
		map.put("id", "100");
		map.put("queryParam", "myParam");
		map.put("queryValue", "myValue");

		URI uri = builder.buildFromMap(map);
		return uri.toString();
	}
	
	@GET
	@Path("/test4")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/uriBuilder-path/test4
	public String test4UriBuilder() {

		UriBuilder builder = UriBuilder.fromResource(CustomerResource.class);
		builder.path(CustomerResource.class,"getCustomer");
		
		return builder.build().toString();
		
	}

}