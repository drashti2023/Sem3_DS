import java.util.*;
public class Lab21_96{
    public static void mergeSort(int[] a,int low,int high){
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);

        }
    }
    public static void merge(int[] a,int low,int mid,int high){
        int [] localarr = new int[high-low +1];
        int h=low;
        int i=0;
        int j=mid+1;
        while(h<=mid && j<=high){
            if(a[h]<=a[j]){
                localarr[i]=a[h];
                h++;
            }else{
                localarr[i]=a[j];
                j++;
            }
            i++;
        }
        while(h<=mid){
            localarr[i]=a[h];
            h++;
            i++;
        }
        while(j<=high){
            localarr[i]=a[j];
            j++;
            i++;
        }
        for(i=0;i<localarr.length;i++){
            a[low+i]=localarr[i];
        }
    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int [] a=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("a"+"["+i+"]");
            a[i]=sc.nextInt();
        }
        mergeSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
        }
}