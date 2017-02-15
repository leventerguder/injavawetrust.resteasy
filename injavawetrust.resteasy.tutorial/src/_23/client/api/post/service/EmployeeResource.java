package _23.client.api.post.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import _23.client.api.post.model.Employee;

@Path("/employee-client-api")
public class EmployeeResource {

	@Path("/addEmployee")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addEmployee(Employee employee) {
		System.out.println("EmployeeResource#addEmployee");
		System.out.println(employee);
		return "addEmployee#succeed";
	}

	@Path("/addEmployeeBatch")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addEmployeeBatch(List<Employee> employees) {
		System.out.println("EmployeeResource#addEmployeeBatch");
		System.out.println(employees);
		return "addEmployeeBatch#succeed";
	}
}
