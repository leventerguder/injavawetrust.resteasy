package _11.encoded.service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/employee-encoded")
// @Encoded
public class EmployeeResource {

	@Path("/getEmployeeEncoded")
	@GET
	// http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployeeEncoded?name=['levent']
	// http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployeeEncoded?name=['öÖğıİçÇöÖğĞ']
	// Using this annotation on a method will disable decoding for all parameters.
	public String getEmployeeByNameEncoded(@Encoded @QueryParam("name") String name)
			throws UnsupportedEncodingException {

		String message = "getEmployeeByNameEncoded is called. <br/>";
		String decodedName = URLDecoder.decode(name, "UTF-8");
		return message + " decodedName :" + decodedName + "<br/>encoded : " + name;

	}

	@Path("/getEmployeeEncodedUTF8")
	@GET
	@Produces("text/html; charset=UTF-8")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployeeEncodedUTF8?name=['öÖğıİçÇöÖğĞ']
	public String getEmployeeByNameEncodedUTF8(@Encoded @QueryParam("name") String name)
			throws UnsupportedEncodingException {

		String message = "getEmployeeByNameEncodedUTF8 is called. <br/>";
		String encodedName = URLDecoder.decode(name, "UTF-8");
		return message + " not encoded :" + name + "<br/>encoded : " + encodedName;

	}
}
