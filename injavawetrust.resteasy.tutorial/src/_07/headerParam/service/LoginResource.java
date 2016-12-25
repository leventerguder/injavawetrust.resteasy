package _07.headerParam.service;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

@Path("/login-headerParam")
public class LoginResource {

	@GET
	@Path("/getInfo")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/login-headerParam/getInfo
	public String getInfo(@HeaderParam("user-agent") String userAgent) {
		String message = "getInfo is called. <br/>" + "User Agent" + userAgent;
		return message;
	}

	@GET
	@Path("/getInfoWithContexth")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/login-headerParam/getInfoWithContexth
	public String getInfoWithContexth(@Context HttpHeaders headers) {
		String message = " getInfoWithContexth is called";

		for (String headerName : headers.getRequestHeaders().keySet()) {
			message = message + "<br/>" + headerName + " : " + headers.getRequestHeader(headerName);
		}
		return message;
	}

}
