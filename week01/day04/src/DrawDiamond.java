package week01.day04.src;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Give me a number, how many rows do you want? ");
        int rows=input.nextInt(), k=0 ;

        for (int i = 1; i <= rows; i++, k = 0) {
                for (int space = 1; space <= rows - i; ++space) {
                    System.out.print("  ");
                }
                while (k != i) {
                    System.out.print("  * ");
                    k++;
                }

                System.out.println("");
            }
        }
    }

