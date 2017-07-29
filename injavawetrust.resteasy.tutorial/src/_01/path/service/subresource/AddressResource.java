package _01.path.service.subresource;

import javax.ws.rs.GET;

public class AddressResource {
	@GET
	public String getAddress() {
		return "Istanbul";
	}
}
