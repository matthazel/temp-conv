import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class TempConv {
    public static void main(String[] args) {
        var keyboard = new Scanner(in);
        char conv;
        double initial, result;

        // Initializing variables that identify conversion, input temperature, and output temperature.
        
        out.print("""
                Temperature Converter:
                Type 1 for Fahrenheit to Celsius
                Type 2 for Celsius to Fahrenheit
                """);

        conv = keyboard.findWithinHorizon(".",0).charAt(0);
                  
        // Program asks user for desired conversion (1 or 2). User input then determines whether the program needs to convert
        // from fahrenheit to celsius or vice versa. 

        // try and do this same thing, but with switch/case:
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html

        // being able to read documentation is also very important ^^

        if (conv == '1') {
            out.print("Enter temperature in Fahrenheit (number only): ");
            initial = keyboard.nextDouble();
            out.println();
            result = (initial - 32) * .5556;
            out.println(initial + " deg Fahrenheit is " + result + " deg Celsius.");
            
            // If the user inputs '1', then the program asks the user to input the temperature in fahrenheit. The program then
            // converts from fahrenheit to celius and displays the temperature in celsius.
            
        } else if (conv == '2') {
            out.print("Enter temperature in Celsius (number only): ");
            initial = keyboard.nextDouble();
            out.println();
            result = (initial * 1.8) + 32;
            out.println(initial + " deg Celsius is " + result + " deg Fahrenheit.");
            
            // If the user inputs '2', then the program asks the user to input the temperature in celsius. the program then
            // converts from celsius to fahrenheit and displays the temperature in fahrenheit.
            
        } else {
            out.println("Error: Please type 1 or 2 to choose conversion.");
        }
        
        // If the user does not input '1' or '2' then the program displays an error message.          

        keyboard.close();
                  
        // Closes the keyboard.          
    }
}
