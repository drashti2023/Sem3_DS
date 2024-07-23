import java.util.*;
public class AverageOfFirstN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        int sum=0;
        float avg=1;
        for(int i=1;i<=n;i++){
            sum+=n;
            avg=(sum/n);
        }
        System.out.println("Average= "+avg);
    }
}