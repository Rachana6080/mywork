package week2;

import java.util.Scanner;
/**
 * Given a string, return the kth index of a string where k is a number.
 * 
 * @author 91963
 *
 */
public class program1 {


	    public static void main(String[] args) {
	        // Create a Scanner object for input
	        Scanner scanner = new Scanner(System.in);

	        // Read the string from the user
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Read the value of k from the user
	        System.out.print("Enter the value of k: ");
	        int k = scanner.nextInt();

	        // Check if k is a valid index
	        if (k >= 0 && k < inputString.length()) {
	            // Print the character at index k
	            char charAtIndexK = inputString.charAt(k);
	            System.out.println("Character at index " + k + ": " + charAtIndexK);
	        } else {
	            System.out.println("Invalid index");
	        }
	        
	        int index = indexOfString(inputString, k);

	        // Close the scanner
	        scanner.close();
	    }
	    
	    private static int indexOfString(String str, int index) {
	    	return -1;
	    }
	}



