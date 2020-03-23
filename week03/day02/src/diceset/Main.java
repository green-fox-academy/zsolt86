/* You have a `DiceSet` class which has a list for 6 dice
     You can roll all of them with roll()
     Check the current rolled numbers with getCurrent()
     You can reroll with reroll()
     Your task is to roll the dice until all of the dice are 6 */
// currentSum solution source: https://www.baeldung.com/java-stream-sum#using-intstreamsum
package diceset;

public class Main {
  public static void main(String[] args) {

    DiceSet diceSet = new DiceSet();
    int currentSum = diceSet.roll().stream().mapToInt(Integer::intValue).sum();
    int counter = 1;
    int sum = 36;


    if (sum == currentSum) {
      System.out.println(diceSet.getCurrent()+"\n⚅ ⚅ ⚅ All of the dice are Sixes, for the 1st roll!⚅ ⚅ ⚅");
    } else {
      while (sum != currentSum) {
        diceSet.reroll();
        currentSum = diceSet.getCurrent().stream().mapToInt(Integer::intValue).sum();
        counter++;
      }
      System.out.println(diceSet.getCurrent() + "\nAll of the dice are Sixes, from " + counter + " rolls.");
    }
  }
}