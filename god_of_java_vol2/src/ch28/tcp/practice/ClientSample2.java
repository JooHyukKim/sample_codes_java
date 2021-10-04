package ch28.tcp.practice;

import ch28.tcp.ClientSample;

import java.io.*;
import java.net.Socket;

public class ClientSample2 {
    public static void main(String[] args) {
        ClientSample2 clientServer = new ClientSample2();
        clientServer.startServer("Whatever you say braw.....");
    }

    private void startServer(String data) {
        Socket client = null;
        while (true) {
            try {
                byte[] buf = data.getBytes();

                client = new Socket("127.0.0.1", 9998);
                OutputStream stream = client.getOutputStream();
                BufferedOutputStream outputStream = new BufferedOutputStream(stream);

                outputStream.write(buf);

                outputStream.close();
                stream.close();
                break;

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (client != null) {
                    try {
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("starting client");
        }


    }
}
