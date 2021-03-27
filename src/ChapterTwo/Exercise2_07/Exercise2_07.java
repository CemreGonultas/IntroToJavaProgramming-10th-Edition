package ChapterTwo.Exercise2_07;
/*
(Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. Here is a sample run:
 */

import java.util.Scanner;

public class Exercise2_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double minutes,year,day = 0;
        System.out.println("Enter the minutes: ");
        minutes = scanner.nextInt();
        year = minutes * (2*Math.pow(10,-6));
        day = minutes * (7*Math.pow(10,-4));
        System.out.println(minutes + " is " + year + " and " + day + " day");

    }
}
