package week1week1;

	import java.util.Stack;

	public class ParenthesisChecker {
	    public static boolean isBalanced(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '{' || c == '[') {
	                stack.push(c);
	            } else if (c == ')' || c == '}' || c == ']') {
	                if (stack.isEmpty()) {
	                    return false; 
	                }
	                char top = stack.pop();
	                // Check if the popped element matches the current closing parenthesis

	                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
	                    return false; 
	                }
	            }
	        }

	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        String testString1 = "([]{})";
	        String testString2 = "([)]";
	        String testString3 = "({](})";
	        
	        if (isBalanced(testString1)) {
	            System.out.println(testString1 + " is balanced.");
	        } else {
	            System.out.println(testString1 + " is not balanced.");
	        }
	        
	        if (isBalanced(testString2)) {
	            System.out.println(testString2 + " is balanced.");
	        } else {
	            System.out.println(testString2 + " is not balanced.");
	        }
	        if (isBalanced(testString3)) {
	            System.out.println(testString3 + " is balanced.");
	        } else {
	            System.out.println(testString3 + " is not balanced.");
	        }
	    }
	}



