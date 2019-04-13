package resource.register;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestApplicationResource extends Application {

	/*
	 * Basic Authentication is the simplest protocol available for performing
	 * authentication over HTTP.
	 * 
	 * It involves sending a Base 64–encoded username and password within a request
	 * header to the server.
	 * 
	 * 
	 * The server checks to see if the username exists within its system and
	 * verifies the sent password
	 */

	/*
	 * The 401 response tells the client that it is not authorized to access the URI
	 * it tried to invoke on
	 */

	/*
	 * To perform authentication, the client must send a request with the
	 * Authorization header set to a Base 64–encoded string of our username and a
	 * colon character, followed by the password.
	 */

	/*
	 * If our username is levent and our password 123456, the Base 64 encoded string
	 * of levent:123456 will be bGV2ZW50OjEyMzQ1Ng==. Put all this together, and our
	 * authenticated GET request would look like this:
	 * 
	 * 
	 */
	// GET /employees/100
	// HTTP/1.1 Authorization: Basic bGV2ZW50OjEyMzQ1Ng==

	/*
	 * The problem with this approach is that if this request is intercepted by a
	 * hostile entity on the network, the hacker can easily obtain the username and
	 * password and use it to invoke its own requests. Using an encrypted HTTP
	 * connection, HTTPS, solves this problem. With an encrypted connection, a rogue
	 * programmer on the network will be unable to decode the transmission and get
	 * at the Authorization header
	 */

	/*
	 * Still, security- paranoid network administrators are very squeamish about
	 * sending passwords over the network, even if they are encrypted within SSL
	 * packets.
	 */
}
