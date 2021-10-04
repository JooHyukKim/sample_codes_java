package ch28.tcp.practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample2 {
    public static void main(String[] args) {
        SocketServerSample2 sample = new SocketServerSample2();
        sample.startServer();
    }

    public <T> void takeGeneric(Some<?> somec, T whatever){

        somec.toString();
    }


    public void startServer() {
        ServerSocket serverSocket = null;
        Socket client = null;
        try {

            serverSocket = new ServerSocket(9998);
            while (true){


                client = serverSocket.accept();
                InputStream in = client.getInputStream();
                BufferedReader breader = new BufferedReader(new InputStreamReader(in));

                String data = null;
                StringBuilder recieved = new StringBuilder();
                while ((data = breader.readLine()) != null) {
                    recieved.append(data);

                }
                System.out.println(recieved);
                in.close();
                breader.close();
                client.close();

                if (recieved!= null && "EXIT".equals(recieved.toString())){
                    System.out.println("stopping");
                    break;
                }

                System.out.println("---------------");

            }





        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (serverSocket !=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}
