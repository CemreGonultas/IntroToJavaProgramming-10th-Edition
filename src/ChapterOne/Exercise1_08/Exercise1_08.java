package ChapterOne.Exercise1_08;
/*
(Area and perimeter of a circle) Write a program that displays the area and perimeter
of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * pi
area = radius * radius * pi
 */

public class Exercise1_08 {
    public static void main(String[] args) {
        double perimeter,area;
        double radius = 5.5;
        double pi = 3.14;
        perimeter = 2 * radius * pi;
        area = radius * radius * pi;
        System.out.println("Perimeter: " + perimeter +
                "\nArea: " + area);

    }

}
