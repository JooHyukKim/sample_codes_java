package ch28.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.HashSet;

public class DatagramServerSample {
    public static void main(String[] args) {
        DatagramServerSample sample = new DatagramServerSample();
        sample.startServer();

        HashSet set = new HashSet<String>();

    }

    private void startServer() {
        DatagramSocket server = null;
        try {
            server = new DatagramSocket(6000);

            int bufferLength = 256;
            byte[] buffer = new byte[bufferLength];
            DatagramPacket packet = new DatagramPacket(buffer, bufferLength);

            while (true) {
                System.out.println("server waiting for reequest.");
                server.receive(packet);
                int dataLength = packet.getLength();
                System.out.println("server : received. Data length = " + dataLength);

                System.out.println("received data = " + dataLength);

                String data = new String(packet.getData(), 0, dataLength);

                System.out.println("received data : " + data);
                if (data.equals("EXIT")) {
                    System.out.println("Stop datagram server");
                    break;
                }

                System.out.println("--------------------------");

            }

        } catch (SocketException e) {
            e.printStackTrace();
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
