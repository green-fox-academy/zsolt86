package aircraftcarrier;

public class Main {
  public static void main(String[] args) {
    Aircraft jet1 = new Aircraft();
    jet1.F16();
    Aircraft jet2 = new Aircraft();
    jet2.F35();

    jet1.getType();
    jet2.getType();
    jet1.getStatus();
    jet2.getStatus();

    jet1.refill(100);
    jet2.refill(200);

    jet1.fight();
    jet2.fight();
    jet1.fight();
    jet2.fight();

    jet2.refill(150);

    jet1.getStatus();
    jet2.getStatus();


  }
}
