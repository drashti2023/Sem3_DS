import java.util.*;
public class Lab7_41{

    public static int isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Test Cases: ");
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String input = sc.nextLine();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
}