package pattern.adaptor;

import org.junit.jupiter.api.Test;

public class AdaptorTest {

  @Test
  void test() {
    System.out.println("---------------------------");

    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    System.out.println("---------------------------");

    Duck duckDaptor = new DuckDaptor(new GooseBumps());
    duckDaptor.performQuack();
    duckDaptor.performFly();

  }
}

interface Goose {
  void gobble();

  void fly();
}

class GooseBumps implements Goose {

  @Override
  public void gobble() {
    System.out.println("gobblle gobble.....");
  }

  @Override
  public void fly() {
    for (int i = 0; i < 5; i++) {
      System.out.println("in the air for....." + (5 - i) + "seconds......");
    }
  }
}

class DuckDaptor extends Duck {

  Goose goose;

  public DuckDaptor(Goose goose) {
    this.goose = goose;
    this.flyBehavior = () -> goose.fly();
    this.quackBehavior = () -> goose.gobble();
  }

  @Override
  public void display() {
    System.out.println("I am DuckDaptor... but I will be a duck for now");
  }
}
