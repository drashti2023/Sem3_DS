import java.util.*;
//shell sort 
public class Lab22_99 {
    public static void shellSort(int[] a){
        int n = a.length;

        for(int gap=n/2; gap>=1; gap=gap/2){
            for(int j=gap; j<n ; j++){
                for(int i= j-gap; i>=0 ;i=i-gap){
                    if(a[i+gap] > a[i]){
                        break;
                    }else{
                        int temp = a[i+gap];
                        a[i+gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
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
    
        shellSort(a);
    
        System.out.println(Arrays.toString(a));
        }
    
}
