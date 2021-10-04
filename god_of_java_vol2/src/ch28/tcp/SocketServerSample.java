package ch28.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args) {

        SocketServerSample sample = new SocketServerSample();
        sample.startServer();
    }

    public void startServer() {
        ServerSocket server = null;
        Socket client = null;

        try {
            server = new ServerSocket(7777);
            while (true) {
                System.out.println("server waiting for request");
                client = server.accept();
                System.out.println("sever accepted");

                InputStream stream = client.getInputStream();
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(stream)
                );

                String data = null;
                StringBuilder received = new StringBuilder();
                while ((data = in.readLine()) != null) {
                    received.append(data);
                }

                System.out.println("recieved data ::: " + received);
                in.close();
                stream.close();
                client.close();
                if (received != null && "EXIT".equals(received.toString())) {
                    System.out.println("stop socket server");
                    break;
                }
                System.out.println("-------------j");

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
