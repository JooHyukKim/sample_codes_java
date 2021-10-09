package item9_trywithresources;

import java.io.*;

public class Main {
    public static String test() throws IOException {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        )) {
            return br.readLine();
        }
    }


}
