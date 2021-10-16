import lemon.BestLemon;
import lemon.FreshLemon;
import org.junit.jupiter.api.Test;

public class FreshLemonTest {

    @Test
    public void freshLemon() {

        FreshLemon lemon2 = new FreshLemon("Yellow", "Very Acid", 5);

        FreshLemon lemon1 = FreshLemon.ofAcidityAndColorAndSize("not acid", "yellow", 4);

        BestLemon bestLemon = new BestLemon.Builder()
                .acidity("Mildly Acid")
                .color("Orange?")
                .size(15)
                .build();
    }
}

