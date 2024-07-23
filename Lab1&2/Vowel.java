import java.util.*;
class Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        char n = sc.nextLine().charAt(0);

        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'){
            System.out.println("Character is a vowel");
        }else{
            System.out.println("Character is not a vowel");
        }
    }
}