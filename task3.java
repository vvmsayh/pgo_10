import java.util.Scanner;
public class task3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create an example array
            double[] array = {1.5, 2.0, 3.7, 4.2, 5.1};

            // Take user input for the number to search
            System.out.print("Enter a number to search in the array: ");
            double numToSearch = scanner.nextDouble();

            // Call the isInArray method to check if the number is in the array
            if (isInArray(array, numToSearch)) {
                System.out.println(numToSearch + " is in the array.");
            } else {
                System.out.println(numToSearch + " is not in the array.");
            }

            scanner.close();
        }

        public static boolean isInArray(double[] arr, double num) {
            for (double element : arr) {
                if (element == num) {
                    return true;
                }
            }
            return false;
        }
    }

