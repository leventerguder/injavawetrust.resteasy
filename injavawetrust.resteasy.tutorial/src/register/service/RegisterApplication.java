package register.service;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import _01.pathAndPathParam.service.CustomerResource;

@ApplicationPath("/")
public class RegisterApplication extends Application{

	   private Set<Object> singletons = new HashSet<Object>();
	   
	   public RegisterApplication() {
	      singletons.add(new CustomerResource());
	   }
	   
	   @Override
	   public Set<Object> getSingletons() {
	      return singletons;
	   }
}
