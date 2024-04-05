//Given a string, return the kth index from the end.

package practice;

public class program5 {
	 public static char kthFromEnd(String str, int k) {
	        if (str == null || str.isEmpty() || k < 0 || k >= str.length()) {
	            System.out.println("Invalid input");
	            return '\0'; // Return a default value indicating invalid input
	        }
	        return str.charAt(str.length() - k - 1);
	    }
	    
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        int k = 3;
	        char result = kthFromEnd(str, k);
	        if (result != '\0') {
	            System.out.println("The character at " + k + " index from the end is: " + result);
	        }
	    }

}
