package inheritance;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {

//    Person john = new Person("John McClane",65,"Male");
//    Person person1 = new Person();
//
//    john.introduce();
//    john.getGoal();
//    person1.introduce();
//    person1.getGoal();

    Student john = new Student("John", 20, "Male", "BME");
    john.skipDays(12);
    john.introduce();
    john.getGoal();


    Student johnTheClone = (Student) john.clone();
    johnTheClone.name = "JohnTheClone";
    johnTheClone.skipDays(5);
    johnTheClone.introduce();
    johnTheClone.getGoal();

//    Mentor pointer = new Mentor("Null Pointer",31,"Male","Junior");
//    pointer.introduce();
//    pointer.getGoal();
//
//    Mentor mentor1 = new Mentor();
//    mentor1.introduce();
//    mentor1.getGoal();


//    Sponsor nynfus = new Sponsor("Nynfas",48,"Male","Nynfus Corporation");
//    Sponsor sponsor1 = new Sponsor();
//
//    nynfus.hire();
//    nynfus.introduce();
//    nynfus.getGoal();
//
//    sponsor1.introduce();
//    sponsor1.getGoal();
  }
}
