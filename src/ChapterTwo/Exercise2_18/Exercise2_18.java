package ChapterTwo.Exercise2_18;
/*
(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
interest = balance * (annualInterestRate/1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month.
 */

import java.util.Scanner;

public class Exercise2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance,annualInterestRate,interest;
        System.out.printf("Enter balance and interest rate: ");
        balance = scanner.nextDouble();
        annualInterestRate = scanner.nextDouble();
        interest = balance * (annualInterestRate/1200);
        System.out.println("The interest is " + interest);

    }
}
