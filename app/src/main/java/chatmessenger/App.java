/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chatmessenger;

import chatmessenger.http.InitServer;

public class App {

    public void getGreeting(){
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        new App().getGreeting();
        InitServer server = new InitServer();

        try{
            server.init();
        }
        catch (Exception e){
            System.out.println("Bleh");
        }
    }
}
