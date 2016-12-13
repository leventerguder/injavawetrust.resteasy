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
		singletons.add(new _06.formParam.service.PersonResource());
		singletons.add(new _07.headerParam.service.LoginResource());
		singletons.add(new _08.cookieParam.service.UserResource());
		singletons.add(new _09.beanParam.service.ProductResource());
		singletons.add(new _09.beanParam.service.UserResource());
		singletons.add(new _10.defaulValue.service.CarResource());
		singletons.add(new _11.encoded.service.EmployeeResource());
		singletons.add(new _12.context.service.ContextResource());
		singletons.add(new _13.standardEntityProvider.service.ProviderResource());
		singletons.add(new _14.jaxb.xml.service.PersonResource());
		singletons.add(new _14.jaxb.xml.service.CustomerResource());
		singletons.add(new _15.jackson.json.service.CustomerResource());
		singletons.add(new _15.jackson.json.service.PersonResource());
		singletons.add(new _16.jettison.json.service.ProductResource());
		singletons.add(new _17.simple.response.code.service.HTTPResponseResource());
		singletons.add(new _18.complex.response.service.PersonResource());
		singletons.add(new _19.exception.service.CustomerResource());
		singletons.add(new _20.exception.mapper.service.CustomerResource());
		singletons.add(new _20.exception.mapper.service.NotFoundExceptionMapper());
		singletons.add(new _21.exception.hierarchy.service.CustomerResource());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
