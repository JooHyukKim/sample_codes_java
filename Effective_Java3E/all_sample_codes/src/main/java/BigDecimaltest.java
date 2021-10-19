import java.math.BigDecimal;

public class BigDecimaltest {
    public static void main(String[] args) {
        float a = 0.4f;
        float b = 0.01f;

        System.out.println(a - b);

        BigDecimal bigA = new BigDecimal("0.4");
        BigDecimal bigB = new BigDecimal("0.01");

        System.out.println(bigA.subtract(bigB));
    }
}
