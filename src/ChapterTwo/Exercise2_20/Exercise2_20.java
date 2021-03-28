package ChapterTwo.Exercise2_20;
/*
(Cost of driving) Write a program that prompts the user to enter the distance to
drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
and displays the cost of the trip.
 */

import java.util.Scanner;

public class Exercise2_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costOfDriving,distace,milesPerGallon,pricePerGallon;
        System.out.printf("Enter the driving distance: ");
        distace = scanner.nextDouble();
        System.out.printf("Enter miles per gallon: ");
        milesPerGallon = scanner.nextDouble();
        System.out.printf("Enter price per gallon: ");
        pricePerGallon = scanner.nextDouble();
        costOfDriving = (distace / milesPerGallon) * pricePerGallon;
        System.out.println("The cost of driving is $" + costOfDriving);

    }
}
