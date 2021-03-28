package ChapterTwo.Exercise2_19;
/*
(Financial application: calculate future investment value)
Write a program that reads in investment amount, annual interest rate,
and number of years, and displays the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 */

import java.util.Scanner;

public class Exercise2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double futureInvestmentValue,investmentAmount,monthlyInterestRate,numberOfYears;
        System.out.printf("Enter investment amount: ");
        investmentAmount = scanner.nextDouble();
        System.out.printf("Enter annual interest rate in percentage: ");
        monthlyInterestRate = scanner.nextDouble();
        System.out.printf("Enter number of years: ");
        numberOfYears = scanner.nextDouble();
        monthlyInterestRate /= 1200;
        futureInvestmentValue = investmentAmount*(Math.pow((1+monthlyInterestRate),(numberOfYears*12)));
        System.out.println("Accumulated value is " + futureInvestmentValue);


    }
}
