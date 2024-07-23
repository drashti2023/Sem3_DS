import java.util.*;
//Insert number at given location in array
class Lab4_21{
    public static void main (String[] args){
        int a[]= {10,20,23,25,45,70,0};
        int index=2;
        int newNum=18;
        System.out.println("Before:"+Arrays.toString(a));

        for(int i= a.length-1;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=newNum;
        System.out.println("After:"+Arrays.toString(a));
    }
}