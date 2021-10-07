package vol1.chapter09;

public class SiblingClass {

    void hi(){
        new RootClass("임ㅓㅏㅓjjk").privatePackageAccess();
        new RootClass("hihih").protectedAccess();
    }

    public static void main(String[] args) {
        new SiblingClass().hi();
    }

}
