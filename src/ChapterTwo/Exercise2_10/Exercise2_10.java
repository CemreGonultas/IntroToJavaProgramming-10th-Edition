package ChapterTwo.Exercise2_10;
/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
length = v^2/2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2) and displays the minimum runway length. Here is a sample run:
 */

import java.util.Scanner;

public class Exercise2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length,v,a;
        System.out.printf("Enter speed: ");
        v = scanner.nextDouble();
        System.out.printf("Enter acceleration: ");
        a = scanner.nextDouble();
        length = (Math.pow(v,2))/(2*a);
        System.out.println("The minimum runway length for this airplane is " + length);

    }
}
