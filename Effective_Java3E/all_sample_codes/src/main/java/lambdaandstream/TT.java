package lambdaandstream;

import java.util.*;
import java.util.function.UnaryOperator;

public class TT {

    public static void main(String[] args) {
        List<String> f = new ArrayList<>();

        f.add("둘");
        f.add("셋");
        f.add("하나");

        Collections.sort(f,
                (s1, s2) -> new TT().compare(s1, s2));

        f.forEach(System.out::println);

        f.sort(Comparator.comparingInt(String::length));

        f.forEach(System.out::println);

    }

    public int compare(String a, String b) {
        if (a.equals("하나") && b.equals("둘")) {
            return -1; // 좌측 객체가 작음
        } else if (a.equals("셋") && b.equals("둘")) {
            return 1; // 우측 객체가 작음
        } else {
            return 0;
        }
    }
}
