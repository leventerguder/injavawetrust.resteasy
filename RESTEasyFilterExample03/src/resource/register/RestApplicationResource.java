package resource.register;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestApplicationResource extends Application {

	/*
	 * In JAX-RS, filters and interceptors are assigned a numeric priority either
	 * through the @Priority annotation or via a programmatic interface defined by
	 * Configurable
	 */
}
