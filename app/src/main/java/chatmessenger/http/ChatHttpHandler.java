package chatmessenger.http;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.*;

public class ChatHttpHandler implements HttpHandler{

    @Override
    public void handle(HttpExchange arg0) throws IOException {
        
        System.out.println("got a hit");
        String response = "This is the response";
        arg0.sendResponseHeaders(200, response.length());
        OutputStream os = arg0.getResponseBody();
        os.write(response.getBytes());
        os.close();

        
    }
    
}
