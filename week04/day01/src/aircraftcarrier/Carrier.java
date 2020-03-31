package aircraftcarrier;

import java.util.ArrayList;

public class Carrier {
  int ammoCarrier;
  int hpCarrier;
  ArrayList<Aircraft> carrier;

  public Carrier(int ammoCarrier, int hpCarrier) {
    this.ammoCarrier = ammoCarrier;
    this.hpCarrier = hpCarrier;
    this.carrier = new ArrayList<Aircraft>();
  }

  public void add(Aircraft aircraft) {
    carrier.add(aircraft);
  }

  public void fill() {
  }

}