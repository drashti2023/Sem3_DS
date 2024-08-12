import java.util.*;

public class BinaryRecursionM2 {
    public static int BinarySearch(int[] arr,int left,int right,int key){
        
        if(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                return BinarySearch(arr, left, mid-1, key);
            }
            else if(arr[mid]<key){
                return BinarySearch(arr, mid+1, right, key);
            }
        
              }
                return -1;
              
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter number to search");
        int key=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]");
            arr[i]=sc.nextInt();
            
        }
        int result = BinarySearch(arr, 0, n - 1, key);

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found  " + arr[result]);
        }    
    }
}