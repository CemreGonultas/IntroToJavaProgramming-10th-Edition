package ChapterTwo.Exercise2_05;
/*(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total. Here is a sample run:

 */

import java.util.Scanner;

public class Exercise2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total,subtotal,gratuity,gratuityRate;
        System.out.printf("Enter the subtotal: ");
        subtotal = scanner.nextDouble();
        System.out.printf("Enter the graduity rate: ");
        gratuityRate = scanner.nextDouble();
        gratuity = ((subtotal * gratuityRate)/100);
        total = gratuity + subtotal;
        System.out.println("The gratuity is $"+ gratuity + " and total is $"+ total);

    }
}
