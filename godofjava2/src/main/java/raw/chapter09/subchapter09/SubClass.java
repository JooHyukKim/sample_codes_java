package raw.chapter09.subchapter09;

import raw.chapter09.RootClass;

public class SubClass extends RootClass{
    public SubClass() {
        super("임시방편");
    }

    void hi(){

        this.protectedAccess();
    }

    public static void main(String[] args) {
        new SubClass().hi();
    }
}
