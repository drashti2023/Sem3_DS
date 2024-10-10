import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int [] arr1={1,2,3,0,0,0};
        int [] arr2={2,5,6};
        int k=0;
        int last=5;

        for(int i=3;i<arr1.length;i++){
            arr1[i]=arr2[k];
            k++;
        }
        for(int i=0;i<=4;i++){
        int exchs=0;
        for(int j=0;j<=last-1;j++){
            if(arr1[j]>arr1[j+1]){
                int temp=arr1[j];
                arr1[j]=arr1[j+1];
                arr1[j+1]=temp;
                exchs=exchs+1;

            }
        }
                last=last-1;
    }
        System.out.println(Arrays.toString(arr1));

    } 
}
    