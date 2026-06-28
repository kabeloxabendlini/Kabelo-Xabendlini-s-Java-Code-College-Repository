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
import java.net.Socket;

public class SimpleClient {

    public static void main(String[] args) {

        try {

            // Create a socket and connect to the server
            Socket chatSocket = new Socket("127.0.0.1", 5000);

            // Create a reader to receive data from the server
            InputStreamReader in =
                    new InputStreamReader(chatSocket.getInputStream());

            BufferedReader reader = new BufferedReader(in);

            // Read a line sent by the server
            String message = reader.readLine();

            // Create a writer to send data to the server
            PrintWriter writer =
                    new PrintWriter(chatSocket.getOutputStream(), true);

            // Send messages to the server
            writer.println("message to send");
            writer.print("another message");

            // Display the received message
            System.out.println("Received: " + message);

            // Close the socket
            chatSocket.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}