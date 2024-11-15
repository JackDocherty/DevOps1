import java.util.Scanner;

public class Dec2Hex {

    // Method to convert an integer to its hexadecimal string representation
    public static String convertToHex(int num) {
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder hexadecimal = new StringBuilder();

        // Loop to convert decimal to hex by dividing and getting remainders
        while (num != 0) {
            int rem = num % 16;
            hexadecimal.insert(0, hexChars[rem]);
            num = num / 16;
        }
        // Return result or "0" if the input number was 0
        return hexadecimal.length() > 0 ? hexadecimal.toString() : "0";
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error no input provided. Please enter an integer.");
            return;
        }

        try {
            int arg1 = Integer.parseInt(args[0]);
            System.out.println("Hexadecimal representation is: " + convertToHex(arg1));
        } catch (NumberFormatException e) {
            System.out.println("Error invalid input. Please enter a valid integer.");
        }
    }
}
