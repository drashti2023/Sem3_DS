import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                count=1;
                break;

            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime number");
        }
    }

    
}
