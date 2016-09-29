package _08.cookieParam.service;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("/user-cookieParam")
public class UserResource {

	@GET
	@Path("/addCoookie")
	public Response addCookie() {
		String result = "addCookie is called.";
		return Response.status(200).entity(result).cookie(new NewCookie("myCookie", "myCookieValue")).build();

	}

	@GET
	@Path("/getCookie")
	public Response getCookie(@CookieParam("myCookie") String userAgent) {
		String result = "getCookie is called.";
		return Response.status(200).entity(result + " " + userAgent).build();

	}

}