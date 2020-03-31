package aircraftcarrier;

public class Main {
  public static void main(String[] args) {


    Aircraft jet1 = new F16();
    Aircraft jet2 = new F35();

    jet1.getStatus();
    jet2.getStatus();

    jet1.fight();
    jet2.fight();

    jet1.refill(8);
    jet2.refill(12);

    jet1.fight();
    jet2.fight();

    jet1.getStatus();
    jet2.getStatus();

    jet1.refill(4);
    jet2.refill(2);

    jet1.getStatus();
    jet2.getStatus();
  }
}