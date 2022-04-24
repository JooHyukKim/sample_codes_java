package pattern.strategy;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("pattern.strategy.Quack");
  }
}

class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<< silence >>");
  }
}

class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("pattern.strategy.Squeak");
  }
}