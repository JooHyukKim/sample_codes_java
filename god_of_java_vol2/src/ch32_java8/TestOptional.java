package ch32_java8;

import java.util.Optional;
import java.util.function.Supplier;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> op1 = Optional.empty();

        Optional<String> op2 = Optional.ofNullable(null);

        Optional<String> op3 = Optional.of("common");

        System.out.println(Optional.of("presentt").isPresent());

        System.out.println(Optional.ofNullable(null).isPresent());
    }

    private void getOptioanlData(Optional<String> data) throws Exception {
        String result1 = data.get();

        String defaultValue = "Defulat";
        String result2 = data.orElse(defaultValue);

        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Vince, the Java God";
            }
        };

        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };

        String result3 = data.orElseGet(supplier);
        String result4 = data.orElseThrow(exceptionSupplier);
    }

}
