package ChapterOne.Exercise1_10;
/*
(Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)
 */

public class Exercise1_10 {
    public static void main(String[] args) {
        double distance = 14/1.6; //Because 1 mile is 1.6 kilometers.
        double time = (45*60+30)/(60*60); //45 minutes and 30 seconds are converted into hours using formula
        double averageSpeed = distance/time;
        System.out.println("Average Speed: "+averageSpeed);
    }
}
