package finalexam.funciotnal;

import java.io.*;
import java.net.Socket;

public class RequestHandler extends Thread {

    private Socket socket;

    public RequestHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        RequestManager requestManager = new RequestManager(this.socket);
        RequestDTO requestDTO = requestManager.readRequest();

        ResponseManager responseManager = new ResponseManager(this.socket, requestDTO);
        responseManager.writeResponse();

        try {

            System.out.println("socket isCLosed : "+ this.socket.isClosed());
            System.out.println("socket isINputshutDown + " + this.socket.isInputShutdown());
            System.out.println("sockket isOutputshutdonw : "+ this.socket.isOutputShutdown());
            System.out.println("Socket closing...");
            this.socket.close();
            System.out.println("----------------------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("socket isCLosed : "+ this.socket.isClosed());
            System.out.println("socket isINputshutDown + " + this.socket.isInputShutdown());
            System.out.println("sockket isOutputshutdonw : "+ this.socket.isOutputShutdown());
            System.out.println("RequestHandler finishsed");
        }
    }
}
