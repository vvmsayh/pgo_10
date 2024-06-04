import java.util.Arrays;
public class task2 {


        public static void main(String[] args) {
            int[] array1 = {1, 2, 3};
            int[] array2 = {4, 5, 6};

            // Call the combineArrays method to combine the arrays
            int[] resultArray = combineArrays(array1, array2);

            // Print the combined array
            System.out.println("Combined array: " + Arrays.toString(resultArray));
        }

        public static int[] combineArrays(int[] arr1, int[] arr2) {
            int combinedLength = arr1.length + arr2.length;
            int[] resultArray = new int[combinedLength];

            // Copy elements from the first array
            System.arraycopy(arr1, 0, resultArray, 0, arr1.length);

            // Copy elements from the second array
            System.arraycopy(arr2, 0, resultArray, arr1.length, arr2.length);

            return resultArray;
        }
    }

