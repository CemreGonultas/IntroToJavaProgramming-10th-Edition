package ChapterThree.Exercise3_04;
/*
(Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */

import java.util.Scanner;

public class Exercise3_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days,todaysDay,numberOfDaysElapsedSinceToday;
        System.out.println("Enter today's day: ");
        todaysDay = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        numberOfDaysElapsedSinceToday = scanner.nextInt();
        days = (numberOfDaysElapsedSinceToday + todaysDay) % 7;
        switch (days){
            case 0 :
                System.out.println("Sunday"); break;
            case 1 :
                System.out.println("Monday"); break;
            case 2 :
                System.out.println("Tuesday"); break;
            case 3 :
                System.out.println("Wednesday"); break;
            case 4 :
                System.out.println("Thursday"); break;
            case 5 :
                System.out.println("Friday"); break;
            case 6 :
                System.out.println("Saturday"); break;
        }
        System.out.println(days);
    }
}
