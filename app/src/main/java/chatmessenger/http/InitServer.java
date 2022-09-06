package chatmessenger.http;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;

public class InitServer {
    
    public void init() throws Exception{
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new ChatHttpHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
