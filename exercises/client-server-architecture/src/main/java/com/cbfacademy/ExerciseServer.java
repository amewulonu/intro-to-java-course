package com.cbfacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
       try{
         ServerSocket serverSocket = new ServerSocket(4040);   
         System.out.println("Server is listening on port 4040...");

         // Accept connection
         Socket clientSocket = serverSocket.accept();
         System.out.println("Client connected!: ");

         // Read message from client
         BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
         String message = input.readLine();
         System.out.println("Message received: " + message);
         
         // Respond to client
         PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
         output.println("Message received: " + message);
       } catch (Exception e) {
        e.printStackTrace();
       }

    }

}
