package week01.day04.src;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Count from: ");
        int number1 = input.nextInt();
        System.out.print("Count to: ");
        int number2 = input.nextInt();
        while (number2<number1) {
            System.out.println("The second number should be bigger, give me a new number!");
            number2 = input.nextInt();
        }
            for (int i = number1; number1 <= number2; number1++) {
                System.out.println(number1);
            }
        }
    }



