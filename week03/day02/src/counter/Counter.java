/*Create Counter class
which has an integer field value
when creating it should have a default value 0 or we can specify it when creating
we can add(number) to this counter another whole number
or we can add() without parameters just increasing the counter's value by one
and we can get() the current value
also we can reset() the value to the initial value*/

package counter;

import java.util.stream.Collector;

public class Counter {
  Integer counterValue;
  int storedValue;

  public Counter(Integer counterValue) {
    this.counterValue = counterValue;
    this.storedValue = counterValue;
    System.out.println("counter " + this.counterValue);
  }

  public Counter() {
    this.counterValue = 0;
  }

  public Integer add() {
    this.counterValue++;
    System.out.println("add " + this.counterValue);
    return counterValue;
  }

  public void get() {
    System.out.println("get " + this.counterValue);
  }

  public void reset() {
    this.counterValue = storedValue;
    System.out.println("reset " + this.counterValue);
  }
}
