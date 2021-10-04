package vol1.chapter17;

import vol1.chapter09.RootClass;

import java.util.Arrays;

/**
 *
 */
public class UserSample  {
    @UserAnnotation(number = 1)
    public static void main(String[] args) {
        UserSample us = new UserSample();

        us.checkAnnotations(us.getClass());

        us.checkAnnotations(new UserChild().getClass());
    }

    @UserAnnotation(number = 1,text = "not same")
    public static void runThis(){
    }

    public void checkAnnotations(Class clazz){
        Arrays.stream(clazz.getMethods()).forEach(m ->{
            Arrays.stream(m.getDeclaredAnnotations()).forEach(System.out::println);
                }
        );

    }
}

class UserChild extends UserSample{

}
