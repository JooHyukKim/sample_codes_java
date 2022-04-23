import org.junit.jupiter.api.Test;

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
