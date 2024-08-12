import java.util.*;
//BubbleSort
public class Lab19_92{
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
        
        int last=n-1;

        for(int i=0;i<=n-2;i++){
            int exchs=0;
            for(int j=0;j<=last-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    exchs=exchs+1;

            }   
        }
        if(exchs==0){
            System.out.println("The array is already sorted");
        }
        else{
                last=last-1;
        }
    }
    System.out.println(Arrays.toString(a));
    
    }
}