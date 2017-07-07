import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by aibar on 7/5/2017.
 */
public class CodeChallenge {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInput = 0;
        String loop = "y";

        int arr[][] = new int[3][3];
        while (loop.equalsIgnoreCase("y")) {
            while (!scnr.hasNextInt()) {
                System.out.println("Integers only!");
                scnr.next();
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    userInput = scnr.nextInt();
                    arr[i][j] = userInput;
                }
            }

            int sum = 0;
            for (int[] row : arr) {
                for (int column : row) {
                    sum += column;
                }
            }
            sum -= arr[1][0];
            sum -= arr[1][2];
            System.out.print("The sum of the numbers in the hour glass array is " + sum);
        }
        if (loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }
    }


}