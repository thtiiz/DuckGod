package strategy;

public class TurboDuck extends Duck {
  public TurboDuck(){
    flyBehavior = new FlyRocketPowered();
    quackBehavior = new Squeak();
  }

  void display(){
    System.out.println("This is TurboDuck!!!");
  }
}
