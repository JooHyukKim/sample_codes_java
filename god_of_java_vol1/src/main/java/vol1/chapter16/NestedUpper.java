package vol1.chapter16;

public class NestedUpper {
    private static int upperStaticVal=3;
     public int upperPublicVal=1;
     private int upperPrivateVal=2;

    static class StaticNested {
        private int num;

        int getValue() {
//            return upperPrivateVal;
            return upperStaticVal;
        }
    }

    class InnerNested {
        private int hi;

        int getHi(){
            return this.hi;
        }

        int getValue(){
            return upperPrivateVal;

        }

        int getValue2(){
            return upperPublicVal;
        }


    }

}

class Main {
    public static void main(String[] args) {
        NestedUpper.InnerNested ni = new NestedUpper().new InnerNested();

        NestedUpper.StaticNested ns = new NestedUpper.StaticNested();

        System.out.println(ni.getHi());
        System.out.println(ni.getValue());

        System.out.println(ni.getValue2());
        System.out.println(ns.getValue());

    }


}
