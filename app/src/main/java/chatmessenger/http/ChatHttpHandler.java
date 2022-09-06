package chatmessenger.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import com.sun.net.httpserver.*;

public class ChatHttpHandler implements HttpHandler{

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        
        String response = "This is the updated response";
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
        //     exchange.getRequestBody(), "UTF-8"));
        // StringBuilder sb = new StringBuilder();
        // String input;

        // while ((input = bufferedReader.readLine()) != null){
        //     sb.append(input).append(" ");
        // }

        // bufferedReader.close();
        // System.out.println(sb.toString().trim());

    }
    
}
