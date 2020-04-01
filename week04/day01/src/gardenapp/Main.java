package gardenapp;

public class Main {

  private static Garden garden;

  public static void main(String[] args) {

    garden = new Garden();

    garden.add(new Flower("Yellow"));
    garden.add(new Flower("Blue"));
    garden.add(new Tree("Purple"));
    garden.add(new Tree("Orange"));

    System.out.println(garden.getStatus());

    garden.Watering(30);
    System.out.println(garden.getStatus());

    garden.Watering(70);
    System.out.println(garden.getStatus());


  }
}
