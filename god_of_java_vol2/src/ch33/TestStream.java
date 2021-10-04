package ch33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        String[] words = new String[]{
                "a", "b", "c", "d"
        };

        Arrays.stream(words).filter(w -> {
            System.out.println(w);

            return false;
        }).collect(Collectors.toList());

        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        l.stream().map(x -> x * 3).forEach(System.out::println);

        System.out.println("--------------------------------");
        List<String> stringList = l.stream().map(x -> x + "개").collect(Collectors.toList());
        stringList.forEach(System.out::println);

        System.out.println("--------------------------------");
        stringList.stream().filter(x -> {
            int i = Integer.valueOf(x.substring(0, 1));
            boolean t = i > 2;
            return t;
        }).forEach(System.out::println);
    }
}
