package _12.context.service;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/context")
public class ContextResource {

	@GET
	@Path("/servletcontext")
	// http://localhost:8080/injavawetrust.jersey.tutorial/context/servletcontext
	public String injectServletContext(@Context ServletContext context) {
		String message = "injectServletContext is called.";
		String contextPath = context.getContextPath();
		return message + "<br/>" + contextPath;
	}

	@GET
	@Path("/servletconfig")
	// http://localhost:8080/injavawetrust.jersey.tutorial/context/servletconfig
	public String injectServletConfig(@Context ServletConfig config) {
		String message = "injectServletConfig is called.";
		return message + "<br/> " + config.getServletName();
	}

	@GET
	@Path("/request")
	// http://localhost:8080/injavawetrust.jersey.tutorial/context/request
	public String injectHttpServletRequest(@Context HttpServletRequest request) {
		String message = "injectHttpServletRequest is called.";
		return message + "<br/> " + request.getPathInfo();
	}

	@GET
	@Path("/response")
	// http://localhost:8080/injavawetrust.jersey.tutorial/context/response
	public String injectHttpServletResponse(@Context HttpServletResponse response) {
		String message = "injectHttpServletResponse is called.";
		return message + "<br/> " + response.getCharacterEncoding();
	}

}
