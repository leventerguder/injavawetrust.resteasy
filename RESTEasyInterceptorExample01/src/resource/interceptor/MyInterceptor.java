package resource.interceptor;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

@Provider
public class MyInterceptor implements WriterInterceptor, ReaderInterceptor {

    @Override
    public Object aroundReadFrom(ReaderInterceptorContext context)
            throws IOException, WebApplicationException {
    	
        System.out.println("-- in MyInterceptor#aroundReadFrom() --");
        System.out.println("request message body:");
        
        InputStream is = context.getInputStream();
        String body = new Scanner(is, "UTF-8").useDelimiter("\\A").next();
        
        System.out.println(body);
        
        context.setInputStream(new ByteArrayInputStream(
                (body+"\nMy appended message in request body.\n").getBytes()));
        
        Object result = context.proceed();
        
        return result;
    }

    @Override
    public void aroundWriteTo(WriterInterceptorContext context)
            throws IOException, WebApplicationException {
        
    	System.out.println("-- in MyInterceptor#aroundWriteTo() --");
        OutputStream os = context.getOutputStream();
        os.write("My output message.\n".getBytes());
        context.proceed();
        
    }
}