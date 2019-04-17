package resource.register;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestApplicationResource extends Application {

	/*
	 * Interceptors are more connected with the marshalling and unmarshalling of the
	 * HTTP message bodies that are contained in the requests and the responses.
	 * They can be used both in the server and in the client side.
	 * 
	 * Keep in mind that they’re executed after the filters and only if a message
	 * body is present.
	 */

	// There are two types of interceptors: ReaderInterceptor and WriterInterceptor
}
