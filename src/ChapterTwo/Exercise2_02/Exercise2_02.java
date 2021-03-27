package ChapterTwo.Exercise2_02;
/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length
 */

import java.util.Scanner;

public class Exercise2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area,radius,length,volume;
        System.out.printf("Enter the radius: ");
        radius = scanner.nextDouble();
        System.out.printf("Enter length: ");
        length = scanner.nextDouble();
        area = radius * radius * Math.PI;
        volume = area * length;
        System.out.println("The area: " + area);
        System.out.println("The volume: " + volume);

    }
}
