import java.util.*;
class Recognize{
    int top = -1;
    int n;
    int a[];
    Recognize(int n){
        this.n = n;
        a = new int[n];
    }
    void push(int x){
        if(top>=(n-1)){
            System.out.println("Stack Overflow");
        }else{
            top++;
            a[top]=x;
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
public class Lab7_39{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        Recognize st = new Recognize(s.length());
        int index = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'c'){
                index = i;
                break;
            }else{
                st.push(s.charAt(i));
            }
        }
        boolean found = true;

        for(int i=index+1;i<s.length();i++){
            if(s.charAt(i) != st.pop()){
                found = false;
                break;
            }
        }
        if(!found){
            System.out.println("Invalid String");
        }else{
            System.out.println("Valid String");
        }
    }
}