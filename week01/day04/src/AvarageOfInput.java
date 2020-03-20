package week01.day04.src;

import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pls give me five number:");
        int no1 = input.nextInt();
        int no2 = input.nextInt();
        int no3 = input.nextInt();
        int no4 = input.nextInt();
        int no5 = input.nextInt();
        float avg = (no1 + no2 + no3 + no4 + no5)/5f;

        System.out.println("Sum: " + (no1 + no2 + no3 + no4 + no5));
        System.out.println("AVG: " + avg);
    }
}
