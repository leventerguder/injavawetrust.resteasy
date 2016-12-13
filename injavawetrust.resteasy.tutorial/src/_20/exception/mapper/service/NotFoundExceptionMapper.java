package _20.exception.mapper.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<CustomerNotFoundException> {

	@Override
	public Response toResponse(CustomerNotFoundException exception) {
		ResponseBuilder builder = Response.status(Response.Status.NOT_FOUND);
		builder.entity(exception.getMessage());
		builder.type(MediaType.TEXT_PLAIN);
		return builder.build();
	}

}
