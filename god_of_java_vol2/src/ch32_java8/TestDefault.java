package ch32_java8;

public interface TestDefault {

    default String getMail() {
        return "mail is this....";
    }
}

class DefaultImpl implements TestDefault {
    public static void main(String[] args) {
        System.out.println(new DefaultImpl().getMail());

        new DefaultImpl().charSeq(new String("12345"));
        new DefaultImpl().charSeq(new StringBuilder().append("1234").append("few").toString());
    }

    private void charSeq(CharSequence charSequence) {
        System.out.println(charSequence);
    }
}
