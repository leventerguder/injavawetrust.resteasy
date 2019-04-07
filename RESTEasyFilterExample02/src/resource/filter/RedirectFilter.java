package resource.filter;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class RedirectFilter implements ContainerRequestFilter {

	// ContainerRequestFilters come in two flavors ; prematching and postmatching
	// Prematching ContainerRequestFilters are designated with the @PreMatching
	// annotation
	// and will execute before the JAX-RS resource methods is matched with the
	// incoming request.

	// A pre-matching filter is executed before the request mathching process is
	// started.
	// This filter can influence which resource method will be matched , changing
	// the HTTP method or by changing the URI etc.

	// Another great use case for request filters is implementing custom
	// authentication protocols.

	@Override
	public void filter(ContainerRequestContext reqContext) throws IOException {

		// redirect conditionally
		if (shouldRedirect(reqContext)) {
			reqContext.setRequestUri(URI.create("/messages/temp"));
		}
	}

	private boolean shouldRedirect(ContainerRequestContext reqContext) {
		return true;
	}
	
	// if we don't use @PreMatching on our filter and still attempt to change the URI,
	// org.jboss.resteasy.spi.UnhandledException: java.lang.IllegalStateException: RESTEASY003125: Can't set URI after match
}
