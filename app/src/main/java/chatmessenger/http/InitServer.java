package chatmessenger.http;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;

public class InitServer implements Runnable{

    @Override
    public void run() {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/chat", new ChatHttpHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }
}
