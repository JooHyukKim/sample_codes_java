package ch33;

public class TestLambda {
    private void calculateClassic() {
        /*Calculate calculateAdd = new Calculate() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }

            @Override
            public int subtraction(int a, int b) {

            }
        };*/
    }

    private void cacluateLambda() {
        Calculate caladd = (a, b) -> a + b;
        System.out.println(caladd.operation(1, 2));

        Calculate calculate = (a, b) -> a - b;

        Ops ops = (a, b) -> a + "feaf" + b;
    }
}


interface Calculate {
    int operation(int a, int b);
}

@FunctionalInterface
interface Ops {
    String addWords(String a, String b);
}
