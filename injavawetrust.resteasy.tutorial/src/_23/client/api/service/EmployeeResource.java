package _23.client.api.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import _23.client.api.model.Employee;

@Path("/employee-client-api")
public class EmployeeResource {

	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addEmployee(Employee employee) {
		System.out.println(employee);
	}

	@Path("/addEmployees")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addEmployees(List<Employee> employees) {
		System.out.println(employees);
	}
}
