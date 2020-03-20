package week01.day04.src;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Give me a number, how many rows do you want?: ");
        int rows=input.nextInt();
        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
