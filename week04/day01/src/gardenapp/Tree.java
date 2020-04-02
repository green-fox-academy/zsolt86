package gardenapp;

public class Tree extends Plant {

  public Tree(String color) {
    super();
    this.color = color;
    this.waterAbsorb = 0.40;
    this.waterThreshold = 10;
    this.name = getClass().getSimpleName();
  }
}
