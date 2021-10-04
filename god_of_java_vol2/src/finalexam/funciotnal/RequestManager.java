package finalexam.funciotnal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class RequestManager {
    private Socket socket;

    public RequestManager(Socket socket) {
        this.socket = socket;
    }

    public RequestDTO readRequest() {

        try {
            InputStream stream = this.socket.getInputStream();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(stream)
            );
            String[] firstParts = reader.readLine().split(" ");

            RequestDTO requestDTO = new RequestDTO(
                    firstParts[0]
                    , firstParts[1]
                    , firstParts[2]
            );

            System.out.println(requestDTO.toString());
            this.socket.shutdownInput();
            return requestDTO;

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }

        return null;
    }
}
