import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Parentheses: ");
        String valid = kb.next();
        boolean result = isValid(valid);
        System.out.println("Output = " + result);
    }

    static Boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> set = new Stack<>();

        for (char ch : arr) {
            if (ch == '(' || ch == '[' || ch == '{') {
                set.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (set.isEmpty()) {
                    return false;
                }
                char a = set.pop();
                if ((ch == ')' && a != '(') || (ch == ']' && a != '[') || (ch == '}' && a != '{')) {
                    return false;
                }
            }
        }
        return set.isEmpty();
    }
}
