//Given a string, return the no. Of words in the string.

package practice;

public class program7 {
	public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Handle null or empty string
        }
        
        // Split the string by whitespace
        String[] words = str.split("\\s+");
        
        // Return the number of words
        return words.length;
    }
    
    public static void main(String[] args) {
        String str = "Hello, World!";
        int wordCount = countWords(str);
        System.out.println("The number of words in the string is: " + wordCount);
    }

}
