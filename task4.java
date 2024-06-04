public class task4 {
        public static void main(String[] args) {
            double[] array = {10.5, 20.3, 15.7, 8.2, 12.9};

            // Call the getArithmeticMean method to calculate the mean
            double mean = getArithmeticMean(array);

            // Print the result
            System.out.println("Arithmetic Mean: " + mean);
        }

        public static double getArithmeticMean(double[] arr) {
            if (arr.length == 0) {
                // Handle the case when the array is empty
                System.out.println("Error: Array is empty.");
                return 0.0;
            }

            double sum = 0.0;

            // Calculate the sum of all elements in the array
            for (double element : arr) {
                sum += element;
            }

            // Calculate the arithmetic mean
            return sum / arr.length;
        }
    }
