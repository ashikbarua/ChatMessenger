/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chatmessenger;

import chatmessenger.http.ChatHttpServer;

import chatmessenger.http.ChatHttpClient;

public class App {
    public static void main(String[] args) {

        new Thread(new ChatHttpClient("192.168.1.123")).start();
        
        try{
            new Thread(new ChatHttpServer()).start();;
        }
        catch (Exception e){
            System.out.println("Bleh");
        }
    }
}
