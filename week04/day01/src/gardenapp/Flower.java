package gardenapp;

public class Flower extends Plant {

  public Flower(String color) {
    super();
    this.color = color;
    waterAbsorb = 0.75;
    neededWaterAmount = 5;
  }

  public Boolean getIsWaterNeeded() {
    return currentWaterAmount < neededWaterAmount;
  }
}
