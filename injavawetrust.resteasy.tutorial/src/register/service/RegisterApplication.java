package register.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RegisterApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RegisterApplication() {
		singletons.add(new _01.path.service.CustomerResource());
		singletons.add(new _02.pathParam.service.CustomerResource());
		singletons.add(new _03.pathSegment.service.CarResource());
		singletons.add(new _04.matrixParam.service.CarResource());
		singletons.add(new _05.queryParam.service.LibraryResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
