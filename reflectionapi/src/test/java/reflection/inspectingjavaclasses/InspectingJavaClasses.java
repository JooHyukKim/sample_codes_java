package reflection.inspectingjavaclasses;

import org.junit.jupiter.api.Test;


import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InspectingJavaClasses {

    @Test
    public void classNameTest() {
        Object goat = new Goat("Goat");
        Class<?> clazz = goat.getClass();

        System.out.println("Goat : " + clazz.getSimpleName());
        System.out.println("reflection.inspectingjavaclasses.Goat : " + clazz.getName());
        System.out.println("reflection.inspectingjavaclasses.Goat : " + clazz.getCanonicalName());

        assertEquals("Goat", clazz.getSimpleName());
        assertEquals("reflection.inspectingjavaclasses.Goat", clazz.getName());
        assertEquals("reflection.inspectingjavaclasses.Goat", clazz.getCanonicalName());
    }

    @Test
    public void classNameWhenObjectCreate() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("reflection.inspectingjavaclasses.Goat");

        assertEquals("Goat", clazz.getSimpleName());
        assertEquals("reflection.inspectingjavaclasses.Goat", clazz.getName());
        assertEquals("reflection.inspectingjavaclasses.Goat", clazz.getCanonicalName());
    }

    @Test
    public void classModifiers() throws ClassNotFoundException {
        Class<?> goatClass = Class.forName("reflection.inspectingjavaclasses.Goat");
        Class<?> animalClass = Class.forName("reflection.inspectingjavaclasses.Animal");

        int goatMods = goatClass.getModifiers();
        int animalMods = animalClass.getModifiers();

        assertTrue(Modifier.isPublic(goatMods));
        assertTrue(Modifier.isPublic(animalMods));
        assertTrue(Modifier.isAbstract(animalMods));
    }

    @Test
    public void givenClass_whenGetsPackageInfo_thenCorrect() {
        Goat goat = new Goat("goat");
        Class<?> goatClass = goat.getClass();
        Package pkg = goatClass.getPackage();

        assertEquals("inspectingjavaclasses", pkg.getName());
    }

    @Test
    void name() {
    }

    @Test
    public void givenClass_whenGetsSuperClass_thenCorrect() {
        Goat goat = new Goat("goat");
        String str = "any string";

        Class<?> goatClass = goat.getClass();
        Class<?> goatSuperClass = goatClass.getSuperclass();

        assertEquals("Animal", goatSuperClass.getSimpleName());
        assertEquals("Object", str.getClass().getSuperclass().getSimpleName());
    }

    @Test
    public void givenClass_whenGetsImplementedInterfaces_thenCorrect() throws ClassNotFoundException {
        Class<?> goatClass = Class.forName("com.baeldung.reflection.Goat");
        Class<?> animalClass = Class.forName("com.baeldung.reflection.Animal");

        Class<?>[] goatInterfaces = goatClass.getInterfaces();
        Class<?>[] animalInterfaces = animalClass.getInterfaces();

        assertEquals(1, goatInterfaces.length);
        assertEquals(1, animalInterfaces.length);
        assertEquals("Locomotion", goatInterfaces[0].getSimpleName());
        assertEquals("Eating", animalInterfaces[0].getSimpleName());
    }
}
