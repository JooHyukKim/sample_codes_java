import lemon.BestLemon;
import lemon.FreshLemon;

import java.util.Arrays;

class GenericFruitTest {
    public static void main(String[] args) {
        GenericFruitShop<FreshLemon> bestLemonGenericFruitShop = new GenericFruitShop<>(
                new FreshLemon[]{
                        new FreshLemon("Yellow", "Very Acid", 5),
                        new FreshLemon("Yellow1", "Very Acid", 5),
                        new FreshLemon("Yellow2", "Very Acid", 5),
                }

        );

        Arrays.stream(bestLemonGenericFruitShop.getFruits()).forEach(f -> f.squeeze());

    }
}
