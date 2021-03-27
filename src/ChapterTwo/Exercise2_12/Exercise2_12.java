package ChapterTwo.Exercise2_12;
/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
a sample run:
 */

import java.util.Scanner;

public class Exercise2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BMI,pounds,inches,meters,kilograms;
        System.out.printf("Enter weight in pounds: ");
        pounds = scanner.nextDouble();
        System.out.printf("Enter height in inches: ");
        inches = scanner.nextDouble();
        meters = inches / 39.370;
        kilograms = pounds / 2.2046;
        BMI = kilograms / (Math.pow(meters,2));
        System.out.println("BMI is " + BMI);



    }
}
