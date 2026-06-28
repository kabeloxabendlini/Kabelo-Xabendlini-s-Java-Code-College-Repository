/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_18;

/**
 *
 * @author Admin
 */
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

/*
 * Final BeatBox server program
 *
 * Most of this code is identical to the SimpleChatServer we made in
 * Chapter 17, Make a Connection. The only difference, in fact, is that
 * this server receives, and then re-sends, two serialized objects
 * instead of a plain String (although one of the serialized objects
 * happens to be a String).
 *
 * (appendix A, Final Code Kitchen, page 682)
 */
public class MusicServer {

    // List of all the client output streams to send messages to when a
    // message is received.
    final List<ObjectOutputStream> clientOutputStreams = new ArrayList<>();

    public static void main(String[] args) {
        new MusicServer().go();
    }

    public void go() {
        try {
            // Open a server socket at port 4242.
            ServerSocket serverSock = new ServerSocket(4242);
            ExecutorService threadPool = Executors.newCachedThreadPool();

            // Keep listening for client connections; create a new Socket
            // and new ClientHandler for each connected client.
            while (!serverSock.isClosed()) {
                Socket clientSocket = serverSock.accept();
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                clientOutputStreams.add(out);
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                threadPool.execute(clientHandler);
                System.out.println("Got a connection");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Send the message and the beat pattern to all the clients.
    public void tellEveryone(Object one, Object two) {
        for (ObjectOutputStream clientOutputStream : clientOutputStreams) {
            try {
                clientOutputStream.writeObject(one);
                clientOutputStream.writeObject(two);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public class ClientHandler implements Runnable {

        private ObjectInputStream in;

        public ClientHandler(Socket socket) {
            try {
                in = new ObjectInputStream(socket.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            Object userName;
            Object beatSequence;
            try {
                while ((userName = in.readObject()) != null) {
                    beatSequence = in.readObject();
                    System.out.println("read two objects");
                    tellEveryone(userName, beatSequence);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}