package item6;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class item9 {
    static String firstLineOfFile(String path, String defaultVal) {
        try (
                FileReader fileReader = new FileReader(path);
                BufferedReader br = new BufferedReader(fileReader)
        ) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

}

