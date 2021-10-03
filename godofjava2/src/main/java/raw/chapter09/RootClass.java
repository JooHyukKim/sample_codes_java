package raw.chapter09;

public class RootClass {

    public RootClass(String hi){

    }



    void privatePackageAccess(){
        System.out.println("package-private access");
    }

    protected void protectedAccess(){
        System.out.println("protected access");
    }
}
