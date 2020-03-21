package counter;

public class Main {
  public static void main(String[] args) {

    Counter counter1 = new Counter(5);

    counter1.add();
    counter1.add();
    counter1.add();
    counter1.get();
    counter1.reset();
    counter1.get();
    counter1.add();
    counter1.add();
    counter1.get();
  }
}
