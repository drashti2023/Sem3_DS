import java.util.*;

public class Lab21_97 {
    public static void quickSort(int [] arr,int LB,int UB){
        if (LB < UB) {
            
            int pi = partition(arr, LB, UB);

            quickSort(arr, LB, pi - 1);
            quickSort(arr, pi + 1, UB);
        }
       

    }
    public static int partition(int[] arr, int LB, int UB) {
        int pivot = arr[LB]; 
        int i = LB + 1;
        int j = UB;

        while (true) {
            while (i <= j && arr[i] <= pivot) {
                i++;
            }

            while (i <= j && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
            
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                break;
            }
        }

       
        int temp = arr[LB];
        arr[LB] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("arr"+"["+i+"]");
            arr[i]=sc.nextInt();
        }

        quickSort(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
}
