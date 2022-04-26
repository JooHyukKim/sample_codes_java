package pattern.template;

import org.junit.jupiter.api.Test;

class Main{
  @Test
  void t(){
    CaffeineBeverage someBev1 = new Coffee();
    CaffeineBeverage someBev2 = new Tea();

    System.out.println("----------------------------------");
    someBev1.performRecipe();
    System.out.println("----------------------------------");
    someBev2.performRecipe();
    System.out.println("----------------------------------");
  }
}
public abstract class CaffeineBeverage {
  public void performRecipe() {
    boilWater();
    putIngredient();
    stir();
    addCondiment();
    serveDrink();
  }

  private void addCondiment() {
  }

  private void stir() {
    System.out.println("Stir it up, little darling stir it up.");
  }

  abstract void putIngredient();

  abstract void serveDrink();

  private void boilWater() {
    System.out.println("boiling hot water!");
  }
}

class Coffee extends CaffeineBeverage {
  @Override
  void putIngredient() {
    System.out.println("adding coffee grains....");
  }

  @Override
  void serveDrink() {
    System.out.println("hot coffee coming up!");
  }
}

class Tea extends CaffeineBeverage{

  @Override
  void putIngredient() {
    System.out.println("bag of tea put in!");
  }

  @Override
  void serveDrink() {
    System.out.println("hot tea coming up~");
  }
}