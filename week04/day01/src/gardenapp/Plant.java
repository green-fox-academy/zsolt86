package gardenapp;

public class Plant {
  protected String color;
  protected String name;
  protected int currentWaterAmount;
  protected int neededWaterAmount;
  protected double waterAbsorb;
  protected Boolean isWaterNeeded;

  public Plant() {
    this.currentWaterAmount = 0;
  }

  public String getName() {
    name = getClass().getSimpleName();
    return name;
  }

  public Boolean getIsWaterNeeded() {
    return isWaterNeeded;
  }


}
