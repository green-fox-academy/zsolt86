package week01.day04.src;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
                // Write a program that asks for two integers
                // The first represents the number of chickens the farmer has
                // The second represents the number of pigs owned by the farmer
                // It should print how many legs all the animals have
        Scanner input = new Scanner(System.in);
        System.out.println("amount of chickens:");
        int chickens = input.nextInt();
        System.out.println("amount of pigs:");
        int pigs = input.nextInt();
        System.out.println(chickens*2 + pigs*4);
    }
}
