import java.util.*;
//SelectionSort
public class Lab20_94{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array:");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=a[min_index];
                a[min_index]=a[i];      //Swap elements
                a[i]=temp;
        }
    }
     System.out.println(Arrays.toString(a));

    }
}