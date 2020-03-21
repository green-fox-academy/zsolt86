/* You have a `DiceSet` class which has a list for 6 dice
     You can roll all of them with roll()
     Check the current rolled numbers with getCurrent()
     You can reroll with reroll()
     Your task is to roll the dice until all of the dice are 6 */

package diceset;

public class Main {
  public static void main(String[] args) {

    DiceSet diceSet = new DiceSet();
    Integer currentSum = diceSet.roll().stream().mapToInt(Integer::intValue).sum();
    int counter = 1;
    Integer sum = 36;


    if (sum == currentSum) {
      System.out.println(diceSet.getCurrent()+"\n You could throw 6 at the first attempt with six dice!");
    } else {
      do {
        diceSet.reroll();
        currentSum = diceSet.getCurrent().stream().mapToInt(Integer::intValue).sum();
        counter++;
      } while (sum != currentSum);
      System.out.println(diceSet.getCurrent() + "\nYou could throw 6 with six dice, from " + counter + " attempts.");
    }
  }
}