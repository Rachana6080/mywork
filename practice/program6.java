//Given a string, return the last word in the string.

package practice;

public class program6 {
	 public static String lastWord(String str) {
	        if (str == null || str.isEmpty()) {
	            return null; // Handle null or empty string
	        }
	        
	        String[] words = str.split("\\s+"); // Split by whitespace
	        if (words.length == 0) {
	            return null; // No words found
	        }
	        
	        return words[words.length - 1]; // Return the last word
	    }
	    
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        String last = lastWord(str);
	        System.out.println("The last word in the string is: " + last);
	    }

}
