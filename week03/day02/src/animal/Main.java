package animal;
/*Create an Animal class
Every animal has a hunger value, which is a whole number
                Every animal has a thirst value, which is a whole number
                when creating a new animal object these values are created with the default 50 value
        Every animal can eat() which decreases their hunger by one
        Every animal can drink() which decreases their thirst by one
        Every animal can play() which increases both by one*/


public class Main {
  public static void main(String[] args) {

    Animal zebra = new Animal();
    System.out.println("Zebra hunger: " + zebra.hunger);
    System.out.println("Zebra thirst: " + zebra.thirst);
    zebra.eat();
    zebra.drink();
    zebra.eat();
    zebra.drink();
    System.out.println("Zebra hunger: " + zebra.hunger);
    System.out.println("Zebra thirst: " + zebra.thirst);
    zebra.play();
    System.out.println("Zebra hunger: " + zebra.hunger);
    System.out.println("Zebra thirst: " + zebra.thirst);
  }
}
