package week01.day04.src;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int random, guess;
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        random = randomNumber.nextInt(100);

        System.out.println("I'm thinking of a number, what do you think it is?");
        while (true) {
            guess = input.nextInt();
            if (guess == random) {
                System.out.println("I tought of: " + random + " and you guessed it! Congrats!");
                break;
            } else if (guess < random) {
                System.out.println("I thought of a bigger number, try again:");
            } else {
                System.out.println("I thought of a smaller number, try again:");
            }
        }
    }
}
