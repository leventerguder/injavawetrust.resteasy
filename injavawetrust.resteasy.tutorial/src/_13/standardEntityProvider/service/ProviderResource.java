package _13.standardEntityProvider.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/provider")
public class ProviderResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/streamingOutput")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/streamingOutput
	public StreamingOutput streamingOutput() {
	//		StreamingOutput sOutput = new StreamingOutput() {
	//			@Override
	//			public void write(OutputStream os) throws IOException, WebApplicationException {
	//				String message = "streamingOutput isCalled.";
	//				os.write(message.getBytes());
	//			}
	//		};
	//		return sOutput;

		// Java8 lambda
		String message = "streamingOutput isCalled.";
		StreamingOutput sOutput = (OutputStream os) -> os.write(message.getBytes());
		return sOutput;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/byteArray")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/byteArray
	public byte[] byteArray() {
		String message = "byteArray is called";
		return message.getBytes();
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/stringXMLResponse")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/stringXMLResponse
	public String stringXMLResponse() {
		String message = "<customer><name>Levent Erguder</name></customer>";
		return message;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/intResponse")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/intResponse
	public int intResponse() {
		//
		return 100;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/booleanResponse")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/booleanResponse
	public boolean booleanResponse() {
		//
		return true;
	}

	@GET
	@Path("/file")
	@Produces(MediaType.TEXT_PLAIN)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/file
	public File getFile() throws URISyntaxException {
		URI uri = getClass().getClassLoader().getResource("file.txt").toURI();
		File file = new File(uri);
		return file;
	}

	@GET
	@Path("/inputStream")
	@Produces(MediaType.TEXT_PLAIN)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/inputStream
	public InputStream getFileInputStream() throws FileNotFoundException, URISyntaxException {
		URI uri = getClass().getClassLoader().getResource("file.txt").toURI();
		File file = new File(uri);
		FileInputStream is = new FileInputStream(file);
		return is;
	}

}
