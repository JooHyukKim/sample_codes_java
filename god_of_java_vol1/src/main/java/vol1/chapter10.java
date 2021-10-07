package vol1;

public class chapter10 {
    public static void main(String[] args) throws Throwable {
//        raw.Child child = (raw.Child) new raw.Parent();
//        raw.Parent parent = new raw.Parent();
//        raw.Child childa = (raw.Child) parent;

        Parent p1 = new Child();
        p1.print();
        ((Child) p1).write();

        if (p1 instanceof Child){
            System.out.println(" raw.Parent instance is actually a CHild");

        }

        p1.hashCode();
    }


}

class Parent {
    void print() throws Throwable {
        System.out.println("parent print");
    }
}

class Child extends Parent {
    void print() throws Throwable {
        System.out.println("child print");

    }

    void write() {
        System.out.println("child write");
    }
}
