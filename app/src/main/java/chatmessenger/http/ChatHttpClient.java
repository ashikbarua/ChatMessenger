package chatmessenger.http;

import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Scanner;

public class ChatHttpClient implements Runnable{

    private HttpClient client;
    private String ipAddress;

    public ChatHttpClient(String ipAddress){
        this.ipAddress = ipAddress;
    }

    private void initiateClient(String ipAddress){
        client = HttpClient.newBuilder()
        .version(HttpClient.Version.HTTP_2)
        .followRedirects(HttpClient.Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .proxy(ProxySelector.of(new InetSocketAddress(ipAddress, 8000)))
        .authenticator(Authenticator.getDefault())
        .build();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String message;
        while(true){
            message = scanner.nextLine();
            initiateClient(ipAddress);
        }
    }
    
}
