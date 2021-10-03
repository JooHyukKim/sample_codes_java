package raw.chapter13;

import java.util.Arrays;

public abstract class AbstractMember {

    public abstract boolean addMember(String string);

    public void printlog(String data) {
        System.out.println("data=" + data);
    }

    public static void main(String[] args) {
        new FinalTest(3).print();
        Arrays.stream(OverTimeValues.values()).forEach(
                e -> {
                    System.out.println(e);
                    System.out.println( e.getAmount());;
                });
    }
}

class FinalTest {
    private final int f;

    FinalTest(int f) {
        this.f = f;
    }

    void print() {
        System.out.println(this.f);
    }
}


enum OverTime {
    ONE,
    TWO,
    THREE;
}

enum OverTimeValues {
    ONE(1000),
    TWO(2000);
    private final int amount;

    OverTimeValues(int i) {
        this.amount = i;
    }

    public int getAmount() {
        return amount;
    }
}
