package ChapterTwo.Exercise2_09;
/*
(Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules. Here is a sample run:
 */

import java.util.Scanner;

public class Exercise2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Q,M,finalTemperature,initialTemperature;
        System.out.printf("Enter the amount of water in kilograms: ");
        M = scanner.nextDouble();
        System.out.printf("Enter the initial temperature: ");
        initialTemperature = scanner.nextDouble();
        System.out.printf("Enter the final temperature: ");
        finalTemperature = scanner.nextDouble();
        Q = M * (finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is " + Q);
    }
}
