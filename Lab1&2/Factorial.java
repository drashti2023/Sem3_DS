import java.util.*;
class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans=1;
        System.out.println("Enter number:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        System.out.println(ans);
    }
}