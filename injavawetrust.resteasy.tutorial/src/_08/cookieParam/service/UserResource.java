package _08.cookieParam.service;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/user-cookieParam")
public class UserResource {

	@GET
	@Path("/addCookie")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/user-cookieParam/addCookie
	public Response addCookie() {

		String result = "addCookie is called.";
		ResponseBuilder builder = Response.ok(result);
		builder.cookie(new NewCookie("myCookie", "myCookieValue"));

		return builder.build();

		// way two
		// return Response.status(200).entity(result).cookie(new NewCookie("myCookie", "myCookieValue")).build();
	}

	@GET
	@Path("/getCookie")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/user-cookieParam/getCookie
	public Response getCookie(@CookieParam("myCookie") String cookie) {
		String result = "getCookie is called. <br/>";

		ResponseBuilder builder = Response.ok(result + " myCookie : " + cookie);
		return builder.build();

		// way two
		// return Response.status(200).entity(result + " myCookie : " + cookie).build();
	}

	@GET
	@Path("/getCookieWithContext")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/user-cookieParam/getCookieWithContext
	public Response getCookieWithContext(@Context HttpHeaders headers) {

		String result = "getCookieWithContext is called. <br/>";
		for (String name : headers.getCookies().keySet()) {
			Cookie cookie = headers.getCookies().get(name);
			result = result + "Cookie: " + name + "=" + cookie.getValue() + "<br/>";
		}
		
		ResponseBuilder builder = Response.ok(result);
		return builder.build();

		//way two
		//return Response.status(200).entity(result).build();
	}

}