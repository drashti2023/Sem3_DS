import java.util.Scanner;
import java.util.Arrays;
//RadixSort
public class Lab20_95 {

    // Function to get the maximum value in the array
    private static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    // Function to perform counting sort on the array based on a specific digit place
    private static void countingSort(int[] a, int exp) {
        int n = a.length;
        int[] output = new int[n]; // Output array to hold sorted values
        int[] count = new int[10]; // Count array for digits 0-9

        // Initialize count array
        Arrays.fill(count, 0);

        // Store count of occurrences of each digit
        for (int i = 0; i < n; i++) {
            count[(a[i] / exp) % 10]++;
        }

        // Change count[i] so that it contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array using the count positions
        for (int i = n - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }

        // Copy the sorted values into the original array
        System.arraycopy(output, 0, a, 0, n);
    }

    // Main function to perform radix sort
    public static void radixSort(int[] a) {
        // Get the maximum number to know the number of digits
        int max = getMax(a);

        // Apply counting sort to sort elements based on place value
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(a, exp);
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Read elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Perform radix sort
        radixSort(a);

        System.out.println(Arrays.toString(a));

    }
}
