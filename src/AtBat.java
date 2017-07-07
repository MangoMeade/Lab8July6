import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by aibar on 7/5/2017.
 */
//Author:Andres
//App prompts for number of batters and how many types they were at-bat. Batting avg and slugging percentage are calculated based on these values.
public class AtBat {
    public static void main(String[] args) {
        System.out.println("Welcome to Batting Average Calculator!");
        Scanner scnr = new Scanner(System.in);
        int atBat = 0;
        int timeAtBat = 0;
        double battingAvg = 0;
        double sluggingAvg = 0;
        DecimalFormat formatter = new DecimalFormat("0.000");
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {
            System.out.println("Enter number of times at bat: ");
            atBat = scnr.nextInt();
//            while (!scnr.hasNextInt()) {
//                System.out.println("Integers only!");
//                scnr.next();
//            }
            if (atBat > 0) {
                int[] arr = new int[atBat];

                //for loop adds players' statistics in an array
                for (int i = 0; i < atBat; i++) {
                    System.out.println("Result for at-bat " + i);
                    timeAtBat = scnr.nextInt();
                    while (timeAtBat > 4 || timeAtBat < 0) {
                        System.out.println("Enter numbers between 0 and 4 only");
                        System.out.println("Result for at-bat " + i);
                        timeAtBat = scnr.nextInt();
                    }
                    arr[i] = timeAtBat;
                }
                ////for loop calculates batting and slugging avg
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > 0) {
                        battingAvg += 1;
                        sluggingAvg += arr[i];
                    }
                }
                battingAvg = battingAvg / arr.length;
                sluggingAvg = sluggingAvg / arr.length;

                System.out.println("Batting average " + formatter.format(battingAvg));
                System.out.println("Slugging average " + formatter.format(sluggingAvg));
                battingAvg = 0;
                sluggingAvg = 0;
                System.out.println("Another batter? (y/n)");
                loop = scnr.nextLine();
                loop = scnr.nextLine();
            } else {
                System.out.println("Number larger than or equal to 0 only");
            }
        }
        if (loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }
    }
}
