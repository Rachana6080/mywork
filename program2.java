//Given a string, return the length of the string.
package week2;
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        // Read the string from the user
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        // Calculate and print the length of the string
        int length = inputString.length();
        System.out.println("Length of the string: " + length);
        // Close the scanner
        sc.close();
    }
}
