package finalexam.funciotnal;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

public class ResponseManager {
    private Socket socket;
    private RequestDTO requestDTO;

    public ResponseManager(Socket socket, RequestDTO requestDTO) {
        this.socket = socket;
        this.requestDTO = requestDTO;
    }

    public boolean writeResponse() {

        if (!requestDTO.getUri().equals("/today")) {
            System.out.println("NOT ASKING FOR TODAY's DATE");
            return true;
        }

        try {
            PrintStream printStream = new PrintStream(this.socket.getOutputStream());

            printStream.println("HTTP/1.1 200 OK");
            printStream.println("Content-type: text/html");
            printStream.println();
            printStream.println(new Random().nextInt(50));

            printStream.flush();
            this.socket.shutdownOutput();

            return true;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return true;
        }

    }
}
