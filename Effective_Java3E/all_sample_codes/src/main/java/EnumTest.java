import org.junit.jupiter.api.Test;

public class EnumTest {

    public static void main(String[] args) {
        EnumTest t = new EnumTest();
        t.appleTest();
        t.operatorTest();
    }

    public void appleTest() {
        System.out.println(Apple.GRANY_SMITH);
        System.out.println(Apple.GRANY_SMITH.name());
        System.out.println(Apple.GRANY_SMITH.first());
        System.out.println(Apple.GRANY_SMITH.second());
    }

    public void operatorTest() {
        double x = Double.valueOf("1.2");
        double y = Double.valueOf("10.0");
        for (Operator op : Operator.values()) {
            System.out.println(x + " " + op + " " + y + " = " + op.apply(x, y));
        }
    }

}

enum Operator {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);
}


enum Apple {
    FUJI("FU", "JI"),
    PIPPIN("PIPP", "in"),
    GRANY_SMITH("GRANY_", "SMITH");

    private final String first;
    private final String second;

    Apple(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String first() {
        return first;
    }

    public String second() {
        return second;
    }
}

