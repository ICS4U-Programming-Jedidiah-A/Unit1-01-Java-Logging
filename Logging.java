import java.util.Scanner;
/**
* This program asks the user for the log length.
* Then it calculates and displays the max number of logs.
*
* @author Jedidiah Alfred
* @version 1.0
* @since 2023-02-18
*/

public final class Logging {
    /**
    * This is a private constructor use to
    * satisfy the style checker.
    *
    * @exception IllegalStateException Utility Class.
    * @see IllegalStateException
    */
    private Logging() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        // Constants that represent predetermined weights and lengths.
        final double qLog = 0.25;
        final double hLog = 0.5;
        final double fLog = 1.0;
        final double mapleWeight = 20.0;
        final double maxWeight = 1100.0;

        // Creating the scanner.
        final Scanner scanner = new Scanner(System.in);

        // Getting log length.
        System.out.print("Enter the length of your log: ");
        final String Selection = scanner.nextLine();
        // Checking to ensure no error occurs.
        try {
            final double selection = Double.parseDouble(Selection);
            // Check to make sure its a valid selection
            if (selection == qLog || selection == hLog || selection == fLog) {
                // Doing the math.
                final double maxLogs = maxWeight / (selection * mapleWeight);

                // Outputting the answer to the user.
                System.out.format("The max number of " + selection
                    + "m logs that will fit on the truck is %.0f \n", maxLogs);
            } else {
                System.out.println("Your selection must be either 0.25,"
                    + " 0.5 or 1");
            }
            if (selection < 0) {
                System.out.println("Number can not be negative");
            } else {

            }

        // What to do if an error was caught.
        } catch (NumberFormatException error) {
            System.out.println("The input must be a numerical value of 0.25, "
                + "0.5 or 1.  "
                + error.getMessage());
        }
    }
}
