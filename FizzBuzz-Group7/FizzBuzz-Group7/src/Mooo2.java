import java.util.Scanner;

/**
 * 
 *
 * @author ramanit
 * @version 1.0.0 2023-11-13 Initial implementation
 *
 */
public class Mooo2
    {
    public static void main( String[] args )
        {
        Scanner scan = new Scanner(System.in);
        int turns = 1;
        while (true) {
            String input = scan.nextLine();
            if ( !calculateThing( turns ).equals( input ) ) {
                break;
            }
            turns++;
            System.out.println(calculateThing( turns ));
            turns++;
            
        }
        }
    private static String calculateThing(int number) {
        if ( number < 1 ) {
            return "No.";
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
   // end class Mooo2