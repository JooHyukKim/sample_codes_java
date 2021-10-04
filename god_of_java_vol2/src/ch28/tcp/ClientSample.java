package ch28.tcp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSample {
    public static void main(String[] args) {
        ClientSample sample = new ClientSample();
        sample.sendSocketSample("LOVE YOU V");

    }

    private void sendSocketSample(String dat) {
        Socket socket = null;
        try {
            System.out.println("client connecting" );
            socket = new Socket("127.0.0.1", 8000);
            System.out.println("Client connect status = "+ socket.isConnected());
            Thread.sleep(1000);

            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            byte[] bytes = dat.getBytes();
            out.write(bytes);
            System.out.println("client sent data");

            out.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
