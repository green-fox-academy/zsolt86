package aircraftcarrier;

public class Main {
  public static void main(String[] args) {


    Aircraft jet1 = new F16();
    jet1.refill(3);
    jet1.refill(2);
    System.out.println(jet1.getStatus());


  }
}