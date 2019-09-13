package strategy;

public class SuperDuck extends Duck {
  public SuperDuck(){
    flyBehavior = new FlyZigzag();
    quackBehavior = new VeryLoudDuck();
  }

  void display() {
    System.out.println("I'm a SuperDUck!!!!!");
  }
}
