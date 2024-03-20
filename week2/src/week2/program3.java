//Given a string, return the no.of vowels and consonants in the string.

package week2;
import java.util.Scanner;

public class program3 {
            public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        // Read input string from the user
	        System.out.print("Enter a string: ");
	        String inputString = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
            // Call the function to count vowels and consonants
	        int[] result = countVowelsAndConsonants(inputString);
	        // Display the result
	        System.out.println("Number of vowels: " + result[0]);
	        System.out.println("Number of consonants: " + result[1]);
	        sc.close();
	    }
	    // Function to count vowels and consonants
	    private static int[] countVowelsAndConsonants(String str) {
	        int vowelsCount = 0;
	        int consonantsCount = 0;
	        for (char ch : str.toCharArray()) {
	            // Check if the character is a letter
	            if (Character.isLetter(ch)) {
	                // Check if the letter is a vowel
	                if ("aeiou".indexOf(ch) != -1) {
	                    vowelsCount++;
	                } else {
	                    consonantsCount++;
	                }
	            }
	        }

	        return new int[]{vowelsCount, consonantsCount};
	    }
	}



