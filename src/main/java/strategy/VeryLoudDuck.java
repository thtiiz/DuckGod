package strategy;

public class VeryLoudDuck implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Loudd!!!!");
  }
}
