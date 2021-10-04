package finalexam.simple;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebserver {
    private int port = 0;

    public SimpleWebserver(int port) {
        this.port = port;
    }

    private final int BUFFER_SIZE = 2048;

    public static void main(String[] args) throws InterruptedException {
        int portNumber = 0;
        try {
            portNumber = Integer.valueOf(args[0]);
        } catch (Exception e) {
            System.out.println(" error while parsing pornumber arugment");
        }

        SimpleWebserver simpleWebserver = new SimpleWebserver(portNumber);
        System.out.println("Running a Simple Webserver with port:" + portNumber);

        simpleWebserver.startServer();

    }

    private void startServer() throws InterruptedException {
        ServerSocket socket = null;

        try {
            socket = new ServerSocket(this.port);

            while (true) {
                Thread.sleep(1000);

                Socket client = socket.accept();

                BufferedInputStream request = new BufferedInputStream(
                        client.getInputStream()
                );

                byte[] receivedBytes = new byte[BUFFER_SIZE];
                request.read(receivedBytes);
                String requestData = new String(receivedBytes).trim();

                System.out.println("Request data = \n" + requestData);
                System.out.println("------------------------------");


                PrintStream response = new PrintStream(client.getOutputStream());

                response.println("HTTP/1.1 200 OK");
                response.println("Content-type: text/html");
                response.println();
                response.println("It is working........");

                response.flush();
                response.close();

                System.out.println("receiving.......");

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
