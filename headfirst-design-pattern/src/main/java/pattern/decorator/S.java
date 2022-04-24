package pattern.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class S {

  @Test
  void t() {
    Beverage beverage = new DarkRoast();
    Beverage decoratedBeverage = new Whip(beverage);

    double diff = Math.abs(decoratedBeverage.cost() - 0.6);

    System.out.println("Testing   expected : " + 0.6 + "    with actual : " + decoratedBeverage.cost() + "   diff : " + diff);
    Assertions.assertTrue(
      diff < 0.00001
    );

    Beverage addSoy = new Soy(decoratedBeverage);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("displaying soy informoation......!");
    System.out.println(addSoy.getDescription());
    System.out.println(addSoy.cost());
  }
}

abstract class Beverage {
  String description = null;


  public String getDescription() {
    return description;
  }

  abstract double cost();
}

abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}

class Whip extends CondimentDecorator {
  Beverage beverage;
  double cost = 0.2;
  String description = " with whip";

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  double cost() {
    return beverage.cost() + this.cost;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + this.description;
  }
}

class DarkRoast extends Beverage {
  String description;

  public DarkRoast() {
    description = "Excellent Dark Roast!";
  }

  public double cost() {
    return 0.4;
  }
}

class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  double cost() {
    return beverage.cost() + 0.1;
  }

  @Override
  public String getDescription() {
    return " with Soy";
  }
}
