package resource.register;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestApplicationResource extends Application {

	// you can apply filter on a per-JAX-RS-method basis.
	// DynamicFeature interface

	// Name binding uses a static approach. With dynamic binding we can implement
	// code which defines the bindings during the application initialization time.
	
	// TO achieve dynamic binding , we need to define a feature (extending a class from Dynamic Feature and annotate it with @Provider)
	// and programmaticaly register our filter ( the filter should not use @Provider) !!!
}
