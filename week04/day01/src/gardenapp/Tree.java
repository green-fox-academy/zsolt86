package gardenapp;

public class Tree extends Plant {

  public Tree(String color) {
    super();
    this.color = color;
    waterAbsorb = 0.40;
    neededWaterAmount = 10;
  }

  public Boolean getIsWaterNeeded() {
    return currentWaterAmount < neededWaterAmount;
  }
}
