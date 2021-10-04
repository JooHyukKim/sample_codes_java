package ch23_set_queue;

import java.util.HashSet;

public class SetSample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("abc");
        set.add("bcd");
        set.add("abc");
        set.stream().forEach(s -> {
            System.out.println(">>> " + s.toString());
        });

    }
}
