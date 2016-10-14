package _11.encoded.service;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.ws.rs.Encoded;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/employee-encoded")
@Encoded
public class EmployeeResource {

	@Path("/getEmployee")
	@GET
	//http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployee?name=['levent']
	//http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployee?name=['öÖğıİçÇöÖğĞ']
	public String getEmployeeByName(@QueryParam("name") String name) {
		
		String message = "getEmployeeByName is called.";
		return message + " name : " + name;

	}

	@Path("/getEmployeeEncoded")
	@GET
	//http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployeeEncoded?name=['levent']
	//http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployeeEncoded?name=['öÖğıİçÇöÖğĞ']
	public String getEmployeeByNameEncoded(@Encoded @QueryParam("name") String name)
			throws UnsupportedEncodingException {
		
		String message = "getEmployeeByNameEncoded is called. <br/>";
		String encodedName = URLDecoder.decode(name, "UTF-8");
		return message + " not encoded :" + name + "<br/>encoded : " + encodedName;

	}
	
	@Path("/getEmployeeEncodedUTF8")
	@GET
	@Produces("text/html; charset=UTF-8")
	//http://localhost:8080/injavawetrust.resteasy.tutorial/employee-encoded/getEmployeeEncodedUTF8?name=['öÖğıİçÇöÖğĞ']
	public String getEmployeeByNameEncodedUTF8(@Encoded @QueryParam("name") String name)
			throws UnsupportedEncodingException {
		
		String message = "getEmployeeByNameEncodedUTF8 is called. <br/>";
		String encodedName = URLDecoder.decode(name, "UTF-8");
		return message + " not encoded :" + name + "<br/>encoded : " + encodedName;

	}
}
