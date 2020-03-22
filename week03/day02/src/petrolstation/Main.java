/*
- Create `Station` and `Car` classes
- `Station`
  - gasAmount
  - refill(car) -> decreases the gasAmount by the capacity of the car and
    increases the cars gasAmount
- `Car`
  - gasAmount
  - capacity
  - create constructor for `Car` where:
    - initialize gasAmount -> 0
    - initialize capacity -> 100
 */

package petrolstation;

public class Main {
  public static void main(String[] args) {

    Station shell = new Station();
    Car ford = new Car();

    System.out.println("Car capacity: " + ford.capacity + "\nCar gas amount: " + ford.gasAmount);

    shell.refill(ford);

    System.out.println("Car capacity: " + ford.capacity + "\nCar gas amount, after refill: " + ford.gasAmount);
    System.out.println("Petrol station gas amount, after refill: " + shell.stationAmount);


  }
}
