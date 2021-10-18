package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("annotation.Sample");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(new Sample());
                    passed++;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    System.out.println(e.getCause());
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                    System.out.println(e.getCause());
                }
            }
        }

        System.out.println(passed + " passed | " + (tests - passed) + " failed");
    }
}
