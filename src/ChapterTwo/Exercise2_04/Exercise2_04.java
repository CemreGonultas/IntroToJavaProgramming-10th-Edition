package ChapterTwo.Exercise2_04;
/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
sample run:
 */

import java.util.Scanner;

public class Exercise2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds,kilograms;
        System.out.printf("Enter a number in pounds: ");
        pounds = scanner.nextDouble();
        kilograms = pounds / 2.2046;
        System.out.println(pounds + " pounds is " + kilograms+ " kilograms");

    }
}
