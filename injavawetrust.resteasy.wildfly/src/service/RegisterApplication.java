package service;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import controller.RestMessageController;

@ApplicationPath("/root-path")

//@ApplicationPath("/") OK
//@ApplicationPath("/*") Don't use /*
//@ApplicationPath("/root-path/*") Don't use /*

public class RegisterApplication extends Application{

	   private Set<Object> singletons = new HashSet<>();
	   
	   public RegisterApplication() {
	      singletons.add(new RestMessageController());
	   }
	   
	   @Override
	   public Set<Object> getSingletons() {
	      return singletons;
	   }
}
