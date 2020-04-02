package gardenapp;

public class Plant {
  protected String color;
  protected String name;
  protected double currentWaterAmount;
  protected double waterThreshold;
  protected double waterAbsorb;


  public Plant() {
    currentWaterAmount = 0;
  }

  public boolean isThirsty() {
    return currentWaterAmount < waterThreshold;
  }

  public void addWater(double waterAmount) {
    this.currentWaterAmount = (waterAmount * waterAbsorb) + currentWaterAmount;
  }
}