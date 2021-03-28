package ChapterThree.Exercise3_06;
/*
(Sort three integers) Write a program that prompts the user to enter three integers
and display the integers in non-decreasing order.
 */

import java.util.Scanner;

public class Exercise3_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Enter three numbers: ");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();
        if(number1 > number2 && number2 > number3){
            System.out.println(number1 + " > " + number2 + " > " + number3);
        }else if(number1>number3 && number3>number2){
            System.out.println(number1 + " > " + number3 + " > " + number2);
        }else if(number2 > number1 && number1 > number3){
            System.out.println(number2 + " > " + number1 + " > " + number3);
        }else if(number2 > number3 && number3 > number1){
            System.out.println(number2 + " > " + number3 + " > " + number1);
        }else if(number3 > number1 && number1 > number2){
            System.out.println(number3 + " > " + number1 + " > " + number2);
        }else{
            System.out.println(number3 + " > " + number2 + " > " + number1);
        }
    }
}
