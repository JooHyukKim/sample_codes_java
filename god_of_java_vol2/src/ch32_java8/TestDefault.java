package ch32_java8;

public interface TestDefault {
    default String getMail() {
        return "mail is this....";
    }
}

class DefaultImpl implements TestDefault {
    public static void main(String[] args) {
        System.out.println(new DefaultImpl().getMail());
    }
}
