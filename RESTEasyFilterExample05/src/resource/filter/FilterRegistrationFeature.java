package resource.filter;

import java.lang.reflect.Method;

import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

import resource.MessageResource;

@Provider
public class FilterRegistrationFeature implements DynamicFeature {
	@Override
	public void configure(ResourceInfo resourceInfo, FeatureContext context) {
		if (MessageResource.class.isAssignableFrom(resourceInfo.getResourceClass())) {
			Method method = resourceInfo.getResourceMethod();
			if (method.getName().toLowerCase().contains("dynamic")) {
				context.register(new LogFilter());
				// These methods will be registered ;
				// getGreetingDynamicFeature
				// chatDynamicFeature
				
				// This method wont be registered;
				// greeting
			}
		}
	}
}