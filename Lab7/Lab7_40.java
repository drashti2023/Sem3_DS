import java.util.*;
class StackPattern{
    int top = -1;
    int n;
    char a[];
    StackPattern(int n){
        this.n = n;
        a = new char[n];
    }
    void push(int x){
        char c=(char)x; 
        if(top>=(n-1)){
            System.out.println("Stack Overflow");
        }else{
            top++;
            a[top]= c;
            System.out.println("Elements pushed successfully");
        }return;
    }
    int pop(){
        if(top == -1){
            return -1;
        }else{
            top--;
            return a[top+1];
        }
    }
}
public class Lab7_40{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check the pattern aibi:");
        String s = sc.nextLine();
        StackPattern st1 = new StackPattern(s.length());
        StackPattern st2 = new StackPattern(s.length());


        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a'){
                st1.push(s.charAt(i));
            }else if(s.charAt(i) == 'b'){
                st2.push('b');
            }
        }
        if(st1.top==st2.top){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}