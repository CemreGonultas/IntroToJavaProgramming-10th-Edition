package ChapterTwo.Exercise2_11;
/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)

 */

import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monthlySavingAmount,total1,total2,total3,total4,total5,total6;
        System.out.printf("Enter the monthly saving amount: ");
        monthlySavingAmount = scanner.nextDouble();
        total1 = monthlySavingAmount * (1 + 0.00417);
        total2 = (monthlySavingAmount + total1) * (1 + 0.00417);
        total3 = (monthlySavingAmount + total2) * (1 + 0.00417);
        total4 = (monthlySavingAmount + total3) * (1 + 0.00417);
        total5 = (monthlySavingAmount + total4) * (1 + 0.00417);
        total6 = (monthlySavingAmount + total5) * (1 + 0.00417);
        System.out.println("After the sixth month, the account value is $" + total6);




    }
}
