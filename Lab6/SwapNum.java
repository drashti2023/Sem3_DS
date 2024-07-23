import java.util.*;
class Number{
    int a;
    int b;
    Number(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void swapNumbers(){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+"b="+b);
    }
}
public class SwapNum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        Number obj = new Number(a,b);
        obj.swapNumbers();
    }
}