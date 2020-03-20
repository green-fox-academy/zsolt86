package week01.day04.src;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner input = new Scanner(System.in);
        System.out.println("Distance (in miles): ");
        double distanceMile = input.nextDouble();
        double distanceKm = (distanceMile*1.609344);
        System.out.println("The distance in km: " + distanceKm);
    }
}
