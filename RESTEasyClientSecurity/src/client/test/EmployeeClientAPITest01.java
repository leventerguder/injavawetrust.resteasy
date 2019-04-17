package client.test;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

import org.jboss.resteasy.client.jaxrs.BasicAuthentication;

import domain.Employee;


public class EmployeeClientAPITest01 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// https://github.com/leventerguder/injavawetrust.resteasy
		// 1 - deploy RESTEasySecurityContext project
		
		String uri = "http://localhost:8080/RESTEasySecurityContext/employees";
		
		Client client = ClientBuilder.newClient();
		client.register(new BasicAuthentication("injavawetrust", "password"));
		WebTarget target = client.target(uri);
		Invocation.Builder builder = target.request();
		
		List<Employee> message = builder.get(List.class);
		
		System.out.println(message);

		client.close();
	}
}
