package ChapterOne.Exercise1_12;
/*(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)

 */

public class Exercise1_12 {
    public static void main(String[] args) {
        double kilometers = 24;
        double distance = kilometers/1.6;
        double times = (1+(40/60)+(35/3600));
        double averageSpeed = distance/times;
        System.out.println("Average Speed: " + averageSpeed);
    }
}
