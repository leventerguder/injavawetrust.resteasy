package _09.beanParam.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import _09.beanParam.model.User;

@Path("/user-beanParam")
public class UserResource {

	@POST
	@Path("/addUser")
	public String addUser(@BeanParam User user) {
		return "addUser is called. " + user.toString();
	}
}
