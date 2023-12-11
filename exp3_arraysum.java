import java.util.Arrays;
import java.util.Scanner;

public class exp3_arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] originalArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            originalArray[i] = scanner.nextInt();
        }

        int[] resultArray = calculateSumExceptIndex(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array: " + Arrays.toString(resultArray));

        scanner.close();
    }

    public static int[] calculateSumExceptIndex(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    sum += arr[j];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
