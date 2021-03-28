package ChapterThree.Exercise3_02;
/*
(Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
that “The equation has no solution.”
 */

import java.util.Scanner;

public class Exercise3_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        System.out.printf("Enter a, b, c, d, e, f: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();
        if(a*d-b*c == 0){
            System.out.println("The equation has no solution");
        }else{
            x = (e*d - b*f)/(a*d - b*c);
            y = (a*f - e*c)/(a*d - b*c);
            System.out.println("x is " + x + " and " + "y is " + y);
        }

    }
}
