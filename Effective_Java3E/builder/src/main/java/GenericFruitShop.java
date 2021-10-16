import lemon.BestLemon;

public class GenericFruitShop<T> {

    T[] fruitList;

    public GenericFruitShop(T[] fruitList) {
        this.fruitList = fruitList;
    }

    public T[] getFruits() {
        return this.fruitList;
    }
}

