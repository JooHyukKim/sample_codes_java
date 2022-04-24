package pattern.strategy;

import org.junit.jupiter.api.Test;
import pattern.strategy.Duck;
import pattern.strategy.FlyRocketPower;
import pattern.strategy.MallardDuck;
import pattern.strategy.ModelDuck;

public class MallardDuckTest {

  @Test
  void test() {
    System.out.println("---------------------------");

    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    System.out.println("---------------------------");

    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPower());
    model.performFly();

    System.out.println("---------------------------");
  }
}
