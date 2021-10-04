package finalexam.funciotnal;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver {
    public static void main(String[] args) {
        Webserver webserver = new Webserver();
        webserver.run();
    }

    public void run() {
        ServerSocket socket = null;

        try {
            socket = new ServerSocket(9000);

            while (true) {
                System.out.println(".");
                Thread.sleep(1000);
                Socket clientRequest = socket.accept();
                new RequestHandler(clientRequest).run();


            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
