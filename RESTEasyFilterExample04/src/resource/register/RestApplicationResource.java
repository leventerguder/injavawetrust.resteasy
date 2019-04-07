package resource.register;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestApplicationResource extends Application {

	// JAX-RS Name binding specification allows to have certain filter(s) executed
	// only for a specific resource method(s).

	/*
	 * To achieve name binding, we need to define an annotation (say A), which
	 * should be meta-annotated with @NameBinding annotation. Then to bind filters
	 * and resource methods together, we need to use our annotation A at both
	 * places.
	 */

}
