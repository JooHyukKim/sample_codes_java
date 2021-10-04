package ch28.udp;

import jdk.nashorn.internal.parser.JSONParser;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;

public class DatagramClientSample {
    public static void main(String[] args) {
        DatagramClientSample sample = new DatagramClientSample();
        sample.sendDatagramSample("this is client data saying hello!@");
        System.getProperties().forEach((p,v) ->{
            System.out.println(p);
        });


    }

    private void sendDatagramSample(String data) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            byte[] buf = data.getBytes();
            DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, address, 6000);
            socket.send(packet);

            socket.send(packet);
            System.out.println("Client sent data");

            socket.close();
            Thread.sleep(1000);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
