package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/employees")
public class EmployeeResource {

	@GET
	public String getEmployees() {
		return "dummy employee list";
	}

	@GET
	@Path("{id}")
	public String getEmployee(@PathParam("id") String id) {
		return "dummy employee with id: " + id;
	}
}