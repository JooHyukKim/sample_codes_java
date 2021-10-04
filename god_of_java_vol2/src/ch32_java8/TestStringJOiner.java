package ch32_java8;

import java.util.StringJoiner;

public class TestStringJOiner {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        String[] words = new String[]{
                "a",
                "b",
                "c"
        };

        for (String w :
                words) {
            joiner.add(w);
        }

        System.out.println(joiner.toString());

        StringJoiner betterJoiner = new StringJoiner(",", "(", ")");
        String[] words2 = new String[]{
                "a",
                "b",
                "c"
        };

        for (String w :
                words2) {
            betterJoiner.add(w);
        }

        System.out.println(betterJoiner.toString());

    }
}
