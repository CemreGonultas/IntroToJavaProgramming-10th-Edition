package ChapterTwo.Exercise2_08;
/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
a = (v1 - v0)/t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration. Here is a sample run:
 */

import java.util.Scanner;

public class Exercise2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double averageAcceleration,v0,v1,t;
        System.out.printf("Enter the v0: ");
        v0 = scanner.nextDouble();
        System.out.printf("Enter the v1: ");
        v1 = scanner.nextDouble();
        System.out.printf("Enter the time: ");
        t = scanner.nextDouble();
        averageAcceleration = (v1 - v0)/t;
        System.out.println("The average acceleration is: " + averageAcceleration);

    }
}
