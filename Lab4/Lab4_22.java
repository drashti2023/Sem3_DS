import java.util.*;
//Delete a number from a given location in an array
public class Lab4_22 {
    public static void main(String[] args){
        int a[] = {1,7,8,23,4,10,17};
        System.out.println("Before:"+Arrays.toString(a));
        int del=1;
        for(int i=del;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1] = 0;
        System.out.println("After:"+Arrays.toString(a));
    }
    
}
