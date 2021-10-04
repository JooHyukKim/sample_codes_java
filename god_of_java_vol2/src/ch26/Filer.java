package ch26;

import java.io.*;
import java.util.Iterator;

public class Filer {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/users/vince/deletable.txt"));
        bw.write("hi name is...");
        for (int i = 0; i < 20; i++) {
           bw.write("fdafa" + i + "\n");
        }
        bw.flush();
        bw.close();

        FileReader fr = new FileReader("/users/vince/deletable.txt");
        BufferedReader br = new BufferedReader(fr);

        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        if (br !=null){
            br.close();
        }

        if (br != null){
            br.close();
        }

//        Iterator it = br.lines().iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
