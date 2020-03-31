package aircraftcarrier;

public class Aircraft {
  protected int ammoCurrent;
  protected int ammoCapacity;
  protected int baseDamage;
  protected int damage;
  protected String type;
  protected boolean isPriority;


  public Aircraft() {
    this.ammoCurrent = 0;
  }

  public int fight() {
    if (ammoCurrent == 0) {
      System.out.println("Your " + getType() + " is out of ammo, refill before fighting!\n");
    } else {
      System.out.println("Your " + getType() + " is FIGHTING!\n");
      damage = baseDamage * ammoCurrent;
      this.ammoCurrent = 0;
    }
    return damage;
  }

  public int refill(int ammoRefill) {
    int ammoRemaining;

    if (ammoRefill < ammoCapacity - ammoCurrent) {
      ammoRemaining = 0;
      this.ammoCurrent = ammoRefill + ammoCurrent;
    } else {
      ammoRemaining = ammoRefill - ammoCapacity;
      this.ammoCurrent = ammoCapacity;
    }
    return ammoRemaining;
  }

  public String getType() {
    type = getClass().getSimpleName();
    return type;
  }

  public String getStatus() {
    return "Type: " + getType() + "\tAmmo: " + this.ammoCurrent + "\tBase Damage: " + this.baseDamage + "\tAll Damage: " + this.damage;
  }

  public boolean isPriority() {
    return isPriority;
  }

  public void setPriority(boolean priority) {
    this.isPriority = priority;
  }
}