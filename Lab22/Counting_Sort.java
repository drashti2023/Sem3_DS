import java.util.Arrays;
import java.util.Scanner;

public class Counting_Sort {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Size of Array");
         int n=sc.nextInt();

         int [] arr=new int[n];

         for(int i=0;i<arr.length;i++){
         System.out.println("arr["+i+"]");
         arr[i]=sc.nextInt();
         }

         int max=arr[0];

         for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
         }

         int [] count=new int[max+1];
         for(int i=0;i<arr.length;i++){
            count[arr[i]]++;   
         }

         for(int i=1;i<=max;i++){
            count[i]=count[i]+count[i-1];
         }

         int output[]=new int[arr.length];
         for(int i=n-1;i>=0;i--){
            output[count[arr[i]-1]]=arr[i];
            count[arr[i]]--;

         }

        System.out.println(Arrays.toString(output)); 

         
    }
}
