//Given a string, return the first word of the string.

package week2;
import java.util.Scanner;
public class program4 {
	    public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner sc = new Scanner(System.in);
	        // Read the string from the user
	        System.out.print("Enter a string: ");
	        String inputString = sc.nextLine();
	        // Split the string by whitespace to get words
	        String[] words = inputString.split("\\s+");
	        // Check if there are words in the string
	        if (words.length > 0) {
	            // Get and print the first word
	            String firstWord = words[0];
	            System.out.println("First word of the string: " + firstWord);
	        } else {
	            System.out.println("No words in the string.");
	        }
	        // Close the scanner
	        sc.close();
	    }
	}


