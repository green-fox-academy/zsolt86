/*Create a Student class that has the same fields and methods as the Person class,
and has the following additional fields:
previousOrganization: the name of the student’s previous company / school
skippedDays: the number of days skipped from the course

methods:
getGoal(): prints out "Be a junior software developer."
introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
skipDays(numberOfDays): increases skippedDays by numberOfDays

The Student class has the following constructors:
Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0*/

package inheritance;

public class Student extends Person implements Cloneable {
  String previousOrganization;
  int skippedDays;

  protected Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  protected Student() {
    name = "Jane Doe";
    age = 30;
    gender = "Female";
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  protected void getGoal() {
    System.out.println("My goal is: Be a junior software developer.");
  }

  protected void introduce() {
    super.introduce();
    System.out.println(" from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  protected int skipDays(int numberOfDays) {
    this.skippedDays += numberOfDays;
    return skippedDays;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }


}
