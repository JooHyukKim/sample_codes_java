import org.junit.jupiter.api.Test;

public class MallardDuckTest {

  @Test
  void test(){
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  }
}
