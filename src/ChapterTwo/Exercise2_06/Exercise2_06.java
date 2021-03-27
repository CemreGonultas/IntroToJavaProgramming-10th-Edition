package ChapterTwo.Exercise2_06;
/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
 */

import java.util.Scanner;

public class Exercise2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum,number,number1,number2,number3,number4;
        System.out.printf("Enter a number between 0 and 1000: ");
        number = scanner.nextInt();
        number1 = number % 10;
        number2 = number / 10;
        number3 = number2 % 10;
        number4 = (number2 - number3)/10;
        sum = number1 + number3 + number4;
        System.out.println("The sum of the digits is " + sum);
    }
}
