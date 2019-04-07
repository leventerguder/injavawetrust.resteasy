package resource.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider

public class LogFilter implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("request info");
		System.out.println(requestContext.getUriInfo().getRequestUri() + " " + requestContext.getMethod());
	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		System.out.println("response info");
		System.out.println(responseContext.getStatusInfo());
	}

	// There are two types of filters : request and response filters :
	// - Request filters execute before a JAX-RS method is invoked.
	// - Response filters execute after the JAX-RS method is finished.
	// - By default they are executed for all HTTP requests , but can be bound a
	// specific JAX-RS method too.

	// Request filters are implementations of the ContainerRequestFilter interface

	// public interface ContainerRequestFilter {
	// public void filter(ContainerRequestContext requestContext)throws IOException;
	// }

}
