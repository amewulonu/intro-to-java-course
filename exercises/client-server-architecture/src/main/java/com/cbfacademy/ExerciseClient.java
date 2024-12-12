package com.cbfacademy;

import java.io.PrintWriter;
import java.net.Socket;

public class ExerciseClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4040)) {
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            
            // Send message to server
            output.println("Hello, Server!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
