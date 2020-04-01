package gardenapp;

import java.util.ArrayList;

public class Garden extends Plant {
  ArrayList<Plant> garden;

  public Garden() {
    this.garden = new ArrayList<Plant>();
  }

  public void add(Plant plant) {
    garden.add(plant);
  }

  public String getStatus() {
    String gardenStatus = "";

    for (Plant plant : garden) {
      if (plant.getIsWaterNeeded()) {
        gardenStatus += "The " + plant.color + " " + plant.getName() + " needs water\n";
      } else {
        gardenStatus += "The " + plant.color + " " + plant.getName() + " doesn't need water\n";
      }
    }
    return gardenStatus;
  }

  public int Watering(int wateringWaterAmount) {
    System.out.println("Watering with: " + wateringWaterAmount);
    for (Plant plant : garden) {
      plant.currentWaterAmount += (wateringWaterAmount / garden.size() + currentWaterAmount);
    }
    return currentWaterAmount;
  }
}
