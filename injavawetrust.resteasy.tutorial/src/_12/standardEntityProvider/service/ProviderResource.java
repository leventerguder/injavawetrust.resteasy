package _12.standardEntityProvider.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/provider")
public class ProviderResource {

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
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/streamingOutput")
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/streamingOutput
	public StreamingOutput streamingOutput() {
		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				String message = "streamingOutput isCalled.";
				os.write(message.getBytes());
			}
		};
		return stream;
	}

	// you can use your file location
	private static final String basePath = "/home/levent/Desktop/";

	@GET
	@Path("/file/{filepath: .*}")
	@Produces(MediaType.TEXT_PLAIN)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/file/abc.txt
	public File getFile(@PathParam("filepath") String path) {
		File file = new File(basePath + path);
		return file;
	}

	@GET
	@Path("/inputStream/{filepath: .*}")
	@Produces(MediaType.TEXT_PLAIN)
	// http://localhost:8080/injavawetrust.resteasy.tutorial/provider/inputStream/abc.txt
	public InputStream getFileInputStream(@PathParam("filepath") String path) throws FileNotFoundException {
		FileInputStream is = new FileInputStream(basePath + path);
		return is;
	}

}
