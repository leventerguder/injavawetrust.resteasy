package resource.filter;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.MultivaluedMap;

// The client side filters are similar to server side filters.
// They can use @Priority , they cannot use name binding and scanning related annotations such as @Provider !!!!

// To Write a client side filter , we need to implement ClientRequestFilter and/or ClientResponseFilter
public class LogClientFilter implements ClientRequestFilter, ClientResponseFilter {

	@Override
	public void filter(ClientRequestContext reqContext) throws IOException {
		System.out.println("-- Client request info --");

		log(reqContext.getUri(), reqContext.getHeaders());

	}

	@Override
	public void filter(ClientRequestContext reqContext, ClientResponseContext resContext) throws IOException {
		System.out.println("-- Client response info --");
		log(reqContext.getUri(), resContext.getHeaders());
	}

	private void log(URI uri, MultivaluedMap<String, ?> headers) {
		System.out.println("Request URI: " + uri.getPath());
		System.out.println("Headers:");
		headers.entrySet().forEach(h -> System.out.println(h.getKey() + ": " + h.getValue()));
	}
}