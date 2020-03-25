/*Create a Person class with the following fields:

name: the name of the person
age: the age of the person (whole number)
gender: the gender of the person (male / female)
And the following methods:

introduce(): prints out "Hi, I'm name, a age year old gender."
getGoal(): prints out "My goal is: Live for the moment!"
And the following constructors:

Person(name, age, gender)
Person(): sets name to Jane Doe, age to 30, gender to female*/

package inheritance;

public class Person {
  protected String name;
  protected int age;
  protected String gender; //Later I will try replace String with enum, but now it's not clear for me

  protected Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  protected Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "Female";
  }

  protected void introduce() {
    System.out.print("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender);
  }

  protected void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }
}

