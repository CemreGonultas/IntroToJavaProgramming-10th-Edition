package ChapterTwo.Exercise2_17;
/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area = sqrt(s(s - side1)(s - side2)(s - side3))
 */

import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,y1,x2,y2,x3,y3,s,side1,side2,side3,area;
        System.out.printf("Enter three points for a triangle: ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        side1 = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        side2 = Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
        side3 = Math.sqrt(Math.pow((x2-x3),2)+Math.pow((y2-y3),2));
        s=(side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The area of the triangle is " + area);


    }
}
