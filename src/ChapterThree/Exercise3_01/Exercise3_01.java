package ChapterThree.Exercise3_01;
/*
(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax2 + bx + c = 0 can be obtained using the following formula:
r1 = sqrt(-b + 2b2 - 4ac)/2aand r2 = sqrt(-b - 2b2 - 4ac)/2a
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
 */

import java.util.Scanner;

public class Exercise3_01 {
    public static void main(String[] args) {
        double a,b,c,r1,r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if((Math.pow(b,2)-4*a*c)>0){
            r1 = ((-b)+(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/2*a;
            r2 = ((-b)+(Math.sqrt((Math.pow(b,2)+(4*a*c)))))/2*a;
            System.out.println("The equation has two roots: " + r1 + " and " + r2);
        }else if((Math.pow(b,2)-4*a*c)==0){
            r1 = ((-b)+(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/2*a; // or r2
            System.out.println("The equation has one root: " + r1);
        }else{
            System.out.println("The equation has no real roots.");
        }

    }
}
