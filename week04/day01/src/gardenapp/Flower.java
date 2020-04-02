package gardenapp;

public class Flower extends Plant {

  public Flower(String color) {
    super();
    this.color = color;
    this.waterAbsorb = 0.75;
    this.waterThreshold = 5;
    this.name = getClass().getSimpleName();
  }
}

