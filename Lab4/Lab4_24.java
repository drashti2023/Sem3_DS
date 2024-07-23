import java.util.Scanner;
//Array deletion already sorted in ascending order
public class Lab4_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, j, num;
        int[] arr = new int[10];

        System.out.print("Enter the number of elements in the array: ");
        n = scanner.nextInt();

        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to be deleted: ");
        num = scanner.nextInt();

        for (i = 0; i < n; i++) {
            if (arr[i] == num) {
                for (j = i; j < n; j++) {
                    arr[j] = arr[j + 1];
                }
                n--;
                i--;
            }
        }

        System.out.println("The array after deletion is:");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }

        scanner.close();
    }
}