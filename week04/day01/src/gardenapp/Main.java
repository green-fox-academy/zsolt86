package gardenapp;

public class Main {

    private static Garden garden;

  public static void main(String[] args) {

      garden = new Garden();

      garden.add(new Flower("Yellow"));
      garden.add(new Flower("Blue"));
      garden.add(new Tree("Purple"));
      garden.add(new Tree("Orange"));

      garden.gardenStatus();
      garden.watering(40);
      garden.gardenStatus();
      garden.watering(70);
      garden.gardenStatus();
  }
}
