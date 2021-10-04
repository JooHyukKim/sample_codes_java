package ch30;

import java.io.FileNotFoundException;

public class SwitchCaseGeneric<X> {

    private X x;

    private Object o;


    public void setValue(X x) {
        this.x = x;
    }

    public <T> SwitchCaseGeneric(T t) {
        this.o = t;
    }

    public static void main(String[] args) {

        SwitchCaseGeneric<Integer> gen1 = new SwitchCaseGeneric<>("Whatever");
        SwitchCaseGeneric<Integer> gen2 = new SwitchCaseGeneric("String");
        SwitchCaseGeneric<Integer> generic3 = new SwitchCaseGeneric<Integer>("String type");


        try {
            if (args.length < 2) throw new IllegalArgumentException("hi");
            if (args.length > 2) throw new FileNotFoundException("fdsfd");
        } catch (IllegalArgumentException | FileNotFoundException exception) {
            System.out.println(args.length);
        }
    }
}
