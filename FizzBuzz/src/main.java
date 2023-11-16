import java.util.Scanner;

/**
 * Game implementation based on the FizzBuzz concept, alternating between a human player and the computer.
 * 
 * @author yeek1
 * @version 1.0.0 2023-11-08 Initial implementation
 */
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int turns = 1;

        while (true) {
            String correctAnswer = calculateThing(turns);

            // Human player's turn
            if (turns % 2 != 0) {
                String input = scan.nextLine();

                // Check if the player wants to stop the game
                if (input.equalsIgnoreCase("stop")) {
                    break;
                }

                // Check if the player's input is correct
                if (!input.equalsIgnoreCase(correctAnswer)) {
                    System.out.println("Incorrect input. The correct answer was: " + correctAnswer);
                    break;
                }
            } 
            // Computer's turn
            else {
                System.out.println(correctAnswer);
            }

            turns++; // Increment turns for the next round
        }

        scan.close(); // Closing the scanner object
        System.out.println("The Game has ended");
    }

    public static String calculateThing(int number) {
        if (number < 1) {
            return "Incorrect";
        }
        if (number % 15 == 0) {
            return "fizz buzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(number);
    }
    
}
// end class Main
