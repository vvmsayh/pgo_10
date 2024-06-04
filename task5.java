public class task5 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 3, 2, 4, 5};

        // Call the isIncreasing method to check the order
        System.out.println("Is array1 in non-decreasing" + isIncreasing(array1));
        System.out.println("Is array2 in non-decreasing" + isIncreasing(array2));
    }

    public static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                // If any element is less than its predecessor, the array is not in non-decreasing order
                return false;
            }
        }
        // If the loop completes without returning false, the array is in non-decreasing order
        return true;
    }
}

