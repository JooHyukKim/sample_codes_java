package annotation;

public class Sample {
    @Test
    public void m1() {
        System.out.println("");
    }

    @Test
    public void m2() {
        throw new RuntimeException("FAIL");
    }

    @Test
    public void m3() {

    }

    @Test
    public void m4() {

        throw new RuntimeException("FAIL");
    }

    @Test
    public void m5() {

    }


    @Test
    public void m6() {
        throw new RuntimeException("FAIL");

    }
}
