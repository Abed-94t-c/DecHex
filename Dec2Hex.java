import java.util.Scanner;

class Dec2Hex {
    public static int Arg1;

    public static void main(String args[]) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Error: No input argument provided. Please provide an integer.");
            return; // Exit the program if no argument is given
        }

        try {
            // Try to parse the first argument as an integer
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not an integer
            System.out.println("Error: Invalid input. Please provide a valid integer.");
            return; // Exit the program if the input is not an integer
        }

        // Continue with the conversion if the input is valid
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}

