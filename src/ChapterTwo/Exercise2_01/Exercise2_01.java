package ChapterTwo.Exercise2_01;

import java.util.Scanner;
/*
(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
 */
public class Exercise2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit,celsius = 0;
        System.out.printf("Please enter a Celsius value: ");
        celsius = scanner.nextDouble();
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is "+fahrenheit + " Fahrenheit ");
    }
}
