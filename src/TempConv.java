import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class TempConv {
    public static void main(String[] args) {
        var keyboard = new Scanner(in);
        char conv;
        double initial, result;

        out.print("""
                Temperature Converter:
                Type 1 for Fahrenheit to Celsius
                Type 2 for Celsius to Fahrenheit
                """);
        conv = keyboard.findWithinHorizon(".",0).charAt(0);

        if (conv == '1'){
            out.print("Enter temperature in Fahrenheit (number only): ");
            initial = keyboard.nextDouble();
            out.println();
            result = (initial - 32) * .5556;
            out.println(initial + " deg Fahrenheit is " + result + " deg Celsius.");
        } else if (conv == '2'){
            out.print("Enter temperature in Celsius (number only): ");
            initial = keyboard.nextDouble();
            out.println();
            result = (initial * 1.8) + 32;
            out.println(initial + " deg Celsius is " + result + " deg Fahrenheit.");
        } else if (conv != '1' && conv != '2'){
            out.println("Error: Please type 1 or 2 to choose conversion.");
        }
        keyboard.close();
    }
}