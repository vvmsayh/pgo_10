package task4;

import java.util.Scanner;

public class main {
    private static final int ARRAY_SIZE = 10;
    private static int[] numbers = new int[ARRAY_SIZE];

    public static void main(String[] args) {
        fillArray();
    }

    // Method to read a number from the user
    public static int readNumber() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    // Method to fill the array
    public static void fillArray() {
        for (int i = 0; i < ARRAY_SIZE; i++) {
            try {
                numbers[i] = readNumber();
            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println("Exception: " + e.getMessage());
            }
        }

        // Display the contents of the array
        System.out.println("Array contents:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
