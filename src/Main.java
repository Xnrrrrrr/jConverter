import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Number Converter Menu:");
            System.out.println("1. Decimal to Hexadecimal");
            System.out.println("2. Decimal to Octal");
            System.out.println("3. Decimal to Binary");
            System.out.println("4. Other Base to Decimal");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter a number (decimal, hexadecimal, octal, or binary): ");
            String input = scanner.next();

            try {
                switch (choice) {
                    case 1:
                        displayBaseConversions(input, 16, "Hexadecimal");
                        break;
                    case 2:
                        displayBaseConversions(input, 8, "Octal");
                        break;
                    case 3:
                        displayBaseConversions(input, 2, "Binary");
                        break;
                    case 4:
                        baseToDecimal(input);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number in the selected base.");
            }
        }

        scanner.close();
    }

    // Method to convert and display a number to hexadecimal, octal, and binary
    public static void displayBaseConversions(String input, int base, String baseName) {
        int decimal;
        if (input.startsWith("0x")) {
            decimal = Integer.parseInt(input.substring(2), 16);
        } else if (input.startsWith("0")) {
            decimal = Integer.parseInt(input, 8);
        } else if (input.matches("[01]+")) {
            decimal = Integer.parseInt(input, 2);
        } else {
            decimal = Integer.parseInt(input, 10); // Default to decimal
        }

        System.out.println(baseName + ": " + Integer.toString(decimal, base));
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + Integer.toString(decimal, 2));
        System.out.println("Octal: " + Integer.toString(decimal, 8));
    }

    // Method to convert and display a number from other bases to decimal
    public static void baseToDecimal(String input) {
        int decimal;
        if (input.startsWith("0x")) {
            decimal = Integer.parseInt(input.substring(2), 16);
        } else if (input.startsWith("0")) {
            decimal = Integer.parseInt(input, 8);
        } else if (input.matches("[01]+")) {
            decimal = Integer.parseInt(input, 2);
        } else {
            decimal = Integer.parseInt(input, 10); // Default to decimal
        }

        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + Integer.toString(decimal, 16));
        System.out.println("Octal: " + Integer.toString(decimal, 8));
        System.out.println("Binary: " + Integer.toString(decimal, 2));
    }
}

//
// dsfdfs