package gardenapp;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    void add(Plant plant) {
        plants.add(plant);
    }

    void watering(double withWaterAmount) {
        System.out.println("\nWatering with: " + (int) withWaterAmount);
        ArrayList<Plant> plantsNeedWater = new ArrayList<>();
        for (Plant p : plants) {
            if (p.isThirsty()) {
                plantsNeedWater.add(p);
            }
        }
        for (Plant pToWater : plantsNeedWater) {
            pToWater.addWater(withWaterAmount / plantsNeedWater.size());
        }
    }

    void gardenStatus() {
        for (Plant p : plants) {
            System.out.println("The " + p.color + " " + p.name + ((p.isThirsty()) ? " needs water" : " doesn't need water"));
        }
    }
}
