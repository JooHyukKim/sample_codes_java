package ch22_collection;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");

        String[] arr = l.toArray(new String[0]);

        for (String a :
                arr) {
            System.out.println(a);
        }
    }


}
