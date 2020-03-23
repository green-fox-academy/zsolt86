package inheritance;

public class Main {
  public static void main(String[] args) {
//    Person john = new Person("John McClane",65,"Male");
//    Person person1 = new Person();
//
//    john.introduce();
//    john.getGoal();
//    person1.introduce();
//    person1.getGoal();

//    Student denis = new Student("Kevin",15,"Male","McDonald's");
//    Student student1 = new Student();
//
//    denis.skipDays(5);
//    denis.introduce();
//    denis.getGoal();
//
//    student1.introduce();
//    student1.getGoal();

    Sponsor nynfus = new Sponsor("Nynfas",48,"Male","Nynfus Corporation");
    Sponsor sponsor1 = new Sponsor();

    nynfus.hire();
    nynfus.introduce();
    nynfus.getGoal();

    sponsor1.introduce();
    sponsor1.getGoal();
  }
}
