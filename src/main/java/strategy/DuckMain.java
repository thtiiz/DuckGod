package strategy;

public class DuckMain {
  public static void main(String[] args){
    TurboDuck td = new TurboDuck();
    td.display();
    td.performFly();
    td.performQuack();

    SuperDuck sd = new SuperDuck();
    sd.display();
    sd.performFly();
    sd.performQuack();
  }
}
