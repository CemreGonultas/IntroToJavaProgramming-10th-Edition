package ChapterTwo.Exercise2_03;
/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 */

import java.util.Scanner;

public class Exercise2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double feet,meters;
        System.out.printf("Enter a value for feet: ");
        feet = scanner.nextDouble();
        meters = feet/3.2808;
        System.out.println(feet + " feet is "+ meters +" meters");
    }

}
