import java.util.logging.Logger;

class Dec2Hex {
    public static int Arg1;
    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static void main(String args[]) {
        // Check if an argument is provided
        if (args.length == 0) {
            logger.severe("Error: No input argument provided. Please provide an integer.");
            return; // Exit the program if no argument is given
        }

        try {
            // Try to parse the first argument as an integer
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not an integer
            logger.severe("Error: Invalid input. Please provide a valid integer.");
            return; // Exit the program if the input is not an integer
        }

        // Continue with the conversion if the input is valid
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";
        logger.info("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        logger.info("Hexadecimal representation is: " + hexadecimal);
    }
}

