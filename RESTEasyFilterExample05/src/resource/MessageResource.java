package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/messages")
public class MessageResource {

	@GET
	@Path("/greeting")

	// http://localhost:8080/RESTEasyFilterExample05/messages/greeting
	public String getGreeting() {
		System.out.println("MessageResource#getGreeting...");
		return "Hello ! MessageResource#getGreeting is invoked ! ";
	}

	@GET
	@Path("/greeting.dynamic.feature")

	// http://localhost:8080/RESTEasyFilterExample05/messages/greeting.dynamic.feature
	
	// The LogFilter is only executed for /grreting.dynamic.feature , what is what we dynamically registered our LogFilter.

	public String getGreetingDynamicFeature() {
		System.out.println("MessageResource#getGreetingDynamicFeature...");
		return "Hello ! MessageResource#getGreetingDynamicFeature is invoked ! ";
	}
	
	@GET
	@Path("/chat.dynamic.feature")

	// http://localhost:8080/RESTEasyFilterExample05/messages/chat.dynamic.feature
	
	// The LogFilter is only executed for /grreting.dynamic.feature , what is what we dynamically registered our LogFilter.

	public String chatDynamicFeature() {
		System.out.println("MessageResource#chatDynamicFeature...");
		return "Hello ! MessageResource#chatDynamicFeature is invoked ! ";
	}

}
