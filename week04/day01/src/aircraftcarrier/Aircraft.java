/*
Aircrafts
Create a class that represents an aircraft
There are 2 types of aircrafts: F16 and F35
Both aircrafts should keep track of their ammunition
F16
Max ammo: 8
Base damage: 30
F35
Max ammo: 12
Base damage: 50
All aircrafts should be created with an empty ammo storage

Methods:
fight
It should use all the ammo (set it to 0) and it should return the damage it deals
The damage dealt is calculated by multiplying the base damage by the ammunition

refill
It should take a number as parameter and subtract as much ammo as possible
It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
It should return the remaining ammo
Eg. Filling an empty F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288

getType
It should return the type of the aircraft as a string

getStatus
It should return a string like: Type F35, Ammo: 10, Base Damage: 50, All Damage: 500

isPriority
It should return if the aircraft is priority in the ammo fill queue. It's true for F35 and false for F16*/

package aircraftcarrier;

public class Aircraft {

  int ammoCurrent;
  int ammoCapacity;
  int ammoAmount;
  int basicDamage;
  int damage;
  int allDamage;
  Boolean isPriority;
  String status;
  String type;

  public void F16() {
    ammoCurrent = 0;
    ammoCapacity = 8;
    basicDamage = 30;
    isPriority = false;
    type = "F-16 Fighting Falcon";
  }

  public void F35() {
    ammoCurrent = 0;
    ammoCapacity = 12;
    basicDamage = 50;
    isPriority = true;
    type = "F-35 Lightning II";
  }

  public void fight() {
    if (ammoCurrent > 0) {
      damage = (ammoCurrent * basicDamage);
      allDamage += damage;
      ammoCurrent = 0;
    } else {
      System.out.println(type + " is currently out of ammo,please refill before begin a fight!\n");
    }
  }

  public int refill(int ammoAmount) {
    ammoCurrent = ammoCapacity;
    this.ammoAmount = ammoAmount - ammoCapacity;
    return ammoAmount;
  }

  public String getType() {
    System.out.println(type + "\n");
    return type;
  }

  public String getStatus() {
    System.out.println("STATUS:" + "\nType: " + type + "\nAmmo(Current/Capacity): " + ammoCurrent + "/" + ammoCapacity + "\nBase Damage: " + basicDamage + "\nAll Damage: " + allDamage + "\n");
    return status;
  }
}
