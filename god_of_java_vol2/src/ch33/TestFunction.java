package ch33;

import java.util.function.Predicate;

public class TestFunction {
    public static void main(String[] args) {
        Predicate<String> p1 = (a) -> a.length() > 5;
        Predicate<String> contains = a -> a.contains("Java");
        Predicate<String> start = a -> a.startsWith("God");

        String s1 = "God of Java";
        String s2 = "Good of Java";

        TestFunction tf = new TestFunction();

        tf.predicateAnd(p1, contains, s1);
        tf.predicateor(p1, start, s1);
        tf.predicateNegate(p1, s1);

        tf.predicateAnd(p1, contains, s2);
        tf.predicateor(p1, start, s2);
        tf.predicateNegate(p1, s2);

    }

    private void predicateAnd(Predicate<String> p1, Predicate<String> p2, String data) {
        System.out.println(p1.and(p2).test(data));
    }

    private void predicateor(Predicate<String> p1, Predicate<String> p2, String data) {
        System.out.println(p1.or(p2).test(data));
    }

    private void predicateNegate(Predicate<String> p, String data) {
        System.out.println(p.negate().test(data));
    }

}
