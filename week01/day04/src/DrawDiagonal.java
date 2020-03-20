package week01.day04.src;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number, how many rows do you want?: ");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            if (i == 0 || i == rows - 1) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(" %");
                }
            } else {
                System.out.print(" %");

                for (int j = 1; j < rows - 1; j++) {
                    if (j == i) {
                        System.out.print(" %");
                    } else {
                        System.out.print("  ");
                    }
                }

                System.out.print(" %");
            }
            System.out.println();
        }
    }
}
