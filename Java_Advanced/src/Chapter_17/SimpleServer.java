/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_17;

/**
 *
 * @author Admin
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) {

        try {

            // Create a server socket that listens on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server started.");
            System.out.println("Waiting for a client...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();

            System.out.println("Client connected!");

            // Create a reader to receive messages from the client
            InputStreamReader isReader =
                    new InputStreamReader(clientSocket.getInputStream());

            BufferedReader reader = new BufferedReader(isReader);

            // Create a writer to send messages to the client
            PrintWriter writer =
                    new PrintWriter(clientSocket.getOutputStream(), true);

            // Send a message to the client
            writer.println("Hello from the server!");

            // Read messages from the client
            String message;

            while ((message = reader.readLine()) != null) {
                System.out.println("Client says: " + message);
            }

            // Close everything
            reader.close();
            writer.close();
            clientSocket.close();
            serverSocket.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}