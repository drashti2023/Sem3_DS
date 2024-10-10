import java.util.*;
//heap sort

public class Lab22_98 {
    public static void heapSort(int[] a){
        int n = a.length;
        for(int i = n/2-1; i>=0 ; i--){
            heapify(a,n,i);
        }

        for(int i = n-1;i>=0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a,i,0);
        }
    }

    public static void heapify(int[] a,int n,int i){
        int maxIndex = i;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;

        if(leftChild < n && a[leftChild] > a[maxIndex]){
            maxIndex=leftChild;
        }
        if(rightChild < n && a[rightChild] > a[maxIndex]){
            maxIndex=rightChild;
        }
        if(i != maxIndex){
            int swap = a[i];
            a[i] = a[maxIndex];
            a[maxIndex] = swap;

            heapify(a,n,maxIndex);
        }
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] a = new int[n];

    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++){
        System.out.println("a"+"["+i+"]");
        a[i]=sc.nextInt();
    }

    heapSort(a);

    System.out.println(Arrays.toString(a));
    }
}
