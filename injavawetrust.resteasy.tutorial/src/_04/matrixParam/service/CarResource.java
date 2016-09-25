package _04.matrixParam.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/car-matrixParam")
public class CarResource {

	@GET
	@Path("/car")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/car-matrixParam/car;brand=Mercedes;color=red;color=blue;
	public String getCarWithMatrixParam(@MatrixParam("brand") String brand, @MatrixParam("color") List<String> color) {
		String message = "getCarWithMatrixParam is called.<br/>" + "Brand : " + brand + " Color : " + color;
		return message;

	}
}
