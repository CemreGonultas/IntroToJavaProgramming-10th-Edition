package ChapterTwo.Exercise2_13;
/*
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
Note that you can use Math.pow(a, 0.5) to compute 2a. Here is a sample run:
 */

import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance,x1,y1,x2,y2;
        System.out.printf("Enter x1: and y1: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.printf("Enter x2 and y2: ");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        distance = Math.pow((Math.pow((x2-x1),2))+((Math.pow((y2-y1),2))),0.5);
        System.out.println("The distance between the two points is " + distance);

    }
}
