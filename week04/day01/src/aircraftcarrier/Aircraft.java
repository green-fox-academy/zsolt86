package aircraftcarrier;

public class Aircraft {
  int ammo;
  int ammoCapacity;
  int baseDamage;
  int damage;
  String type;
  boolean isPriority;

  public Aircraft() {
    this.ammo = 0;
  }

  public int fight() {
    if (ammo == 0) {
      System.out.println("Your " + getType() + " is out of ammo, refill before fighting!\n");
    } else {
      System.out.println("Your " + getType() + " is FIGHTING!\n");
      damage = baseDamage * ammo;
      this.ammo = 0;
    }
    return damage;
  }

  public int refill(int amount) {
    int ammoRemaining;
    System.out.println("Your " + getType() + " is refilling with " + amount + " amount of ammo!\n");

    if (amount < ammoCapacity) {
      ammoRemaining = 0;
      this.ammo = amount;
    } else {
      ammoRemaining = amount - ammoCapacity;
      this.ammo = ammoCapacity;
    }
    return ammoRemaining;
  }

  public String getType() {
    return type;
  }

  public void getStatus() {
    System.out.println("Type: " + getType() + "\nAmmo: " + this.ammo + "\nBase Damage: " + this.baseDamage + "\nAll Damage: " + this.damage + "\n");
  }
}