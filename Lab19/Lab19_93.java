//INSERTION SORT
import java.util.*;
class Lab19_93{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array:");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Unsorted Array: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }

        int i=1;
        while(i<a.length){
            int key = a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j=j-1;
            }
            a[j+1]=key;
            i=i+1;
        }
        System.out.println(Arrays.toString(a));
     
    }
}