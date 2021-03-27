package ChapterTwo.Exercise2_14;
/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is ... where s is the length of a side. Here is a sample run:
 */

import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area,s;
        System.out.printf("Enter the side: ");
        s = scanner.nextDouble();
        area = ((3*Math.sqrt(3))/2) * Math.pow(s,2);
        System.out.println("The area of the hexagon is " + area);
    }
}
