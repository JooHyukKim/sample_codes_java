public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
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
    System.out.println("Squeak");
  }
}