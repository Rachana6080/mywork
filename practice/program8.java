//Given a string, return the substring from i to j where I,j are inputs.

package practice;

public class program8 {
	    public static String getSubstring(String str, int i, int j) {
	        if (str == null || i < 0 || j < 0 || i >= str.length() || j > str.length() || i > j) {
	            return null; // Handle invalid input
	        }
	        
	        return str.substring(i, j); // Extract and return the substring
	    }
	    
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        int i = 7;
	        int j = 12;
	        String substring = getSubstring(str, i, j);
	        System.out.println("Substring from index " + i + " to " + j + " is: " + substring);
	    }
	


}
