import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aibar on 7/5/2017.
 */
//Author:Andres
//App prompts for number of batters and how many types they were at-bat. Batting avg and slugging percentage are calculated based on these values.

public class AtBat2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Batting Average Calculator!");
        Scanner scnr = new Scanner(System.in);
        int userInput = 0;
        int numBatters = 0;
        int timesAtBat = 0;
        double battingAvg = 0;
        double sluggingAvg = 0;
        DecimalFormat formatter = new DecimalFormat("0.000");
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {

            System.out.println("Enter numbers of batters");
            numBatters = scnr.nextInt();
            System.out.println("Enter times at-bat");
            timesAtBat = scnr.nextInt();

            if (numBatters > 0 && timesAtBat > 0) {
                int arr[][] = new int[numBatters][timesAtBat];

                //for loop adds players' statistics in an array
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.println("Result for at bat " + (j + 1) + " for batter num " + (i + 1));
                        userInput = scnr.nextInt();
                        while (userInput > 4 || userInput < 0) {
                            System.out.println("Enter numbers between 0 and 4 only");
                            System.out.println("Result for at bat " + (j + 1) + " for batter num " + (i + 1));
                            userInput = scnr.nextInt();
                        }
                        arr[i][j] = userInput;
                    }
                }

                //for loop calculates batting and slugging avg
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        sum += arr[i][j];
                        if (arr[i][j] > 0) {
                            battingAvg += 1;
                            sluggingAvg += arr[i][j];
                        }
                    }
                    battingAvg = battingAvg / arr.length;
                    sluggingAvg = sluggingAvg / arr.length;
                    System.out.println("Batter " + (i + 1) + " average: " + formatter.format(battingAvg) + "     " + " slugging percentage " + formatter.format(sluggingAvg));
                    System.out.println();
                    sum = 0;
                    battingAvg = 0;
                    sluggingAvg = 0;
                }
                System.out.println("Calculate again? (y/n)");
                loop = scnr.nextLine();
                loop = scnr.nextLine();
            }
            else {
                System.out.println("Number larger than 0 only");
            }
        }
        if (loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }

    }


}
