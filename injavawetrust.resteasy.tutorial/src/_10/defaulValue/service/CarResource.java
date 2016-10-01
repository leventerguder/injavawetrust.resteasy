package _10.defaulValue.service;

import java.util.List;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/car-defaultValue")
public class CarResource {
	
	/*
	 javax.ws.rs.PathParam
	 javax.ws.rs.QueryParam
	 javax.ws.rs.MatrixParam
	 javax.ws.rs.CookieParam
	 javax.ws.rs.FormParam
	 javax.ws.rs.HeaderParam
	 */

	@GET
	@Path("/carById")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/car-defaultValue/carById
	public String getCarById(@DefaultValue("100") @QueryParam("id") int id) {
		String message = "getBookById is called. <br/>" + " Id : " + id;
		return message;

	}

	@GET
	@Path("/carByMatrixParam")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/car-defaultValue/carByMatrixParam
	public String getCarByMatrixParam(@DefaultValue("default value") @MatrixParam("brand") String brand,
			@DefaultValue("default color") @MatrixParam("color") List<String> colors) {
		String message = "getCarWithMatrixParam is called.<br/>" + "Brand : " + brand + " Colors : " + colors;
		return message;

	}
}
