package _03.pathSegment.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.PathSegment;

@Path("/car-pathSegment")
public class CarResource {

	@GET
	@Path("/car/{search : criteria}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/car-pathSegment/car/criteria;brand=Mercedes;color=red;color=blue;
	public String getCar(@PathParam("search") PathSegment pathSegment) {
		String brand = pathSegment.getMatrixParameters().getFirst("brand");
		List<String> colors = pathSegment.getMatrixParameters().get("color");
		String message = "getCar is called.<br/>";
		return message + "Brand : " + brand + " , Color :  " + colors;

	}

	@GET
	@Path("car/{props : .+}/year/{year}")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/car-pathSegment/car/mercedes/red/blue/year/2016
	public String getCarByYear(@PathParam("props") List<PathSegment> props, @PathParam("year") String year) {
		String message = "getCarByYear is called.<br/>";
		return message + "Properties : " + props + " , Year : " + year;
	}

}
