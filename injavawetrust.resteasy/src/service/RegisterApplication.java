package service;


import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import controller.RestMessageController;

public class RegisterApplication extends Application{

	   private Set<Object> singletons = new HashSet<Object>();
	   
	   public RegisterApplication() {
	      singletons.add(new RestMessageController());
	   }
	   
	   @Override
	   public Set<Object> getSingletons() {
	      return singletons;
	   }
}
