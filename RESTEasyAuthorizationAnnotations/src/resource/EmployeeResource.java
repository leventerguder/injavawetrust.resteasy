package resource;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/employees")
/*
 * The @RolesAllowed annotation defines the roles permitted to execute a
 * specific operation.
 */
@RolesAllowed({ "ADMIN", "EMPLOYEE" })

/*
 * EmployeeResource class is annotated with @RolesAllowed to specify that, by
 * default, only ADMIN and EMPLOYEE users can execute HTTP operations and paths
 * defined in that class.
 */
public class EmployeeResource {

	@GET
	@RolesAllowed("ADMIN")
	public String getEmployees() {
		return "dummy employee list";
	}

	// The getEmployee() method is not annotated with any security annotations, so
	// it inherits this default behavior
	@GET
	@Path("{id}")
	public String getEmployee(@PathParam("id") String id) {
		return "dummy employee with id: " + id;
	}

	/*
	 * The @PermitAll annotation specifies that any authenticated user is permitted
	 * to invoke your operation.
	 */

	// This overrides the default behavior so that any authenticated user can access
	// that URI and operation.
	@GET
	@Path("/hello")
	@PermitAll
	public String getHello() {
		return "server is up!";
	}

	@Path("/details")
	@GET
	@RolesAllowed("ADMIN")
	public String getEmployeeDetails() {
		return "details...";
	}
}