package randd;
import java.util.Arrays;
public class Program20 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 3, 2, 1};
		System.out.println("Array: " + Arrays.toString(array));
		boolean isPalindrome = checkPalindrome(array);
		if(isPalindrome) {
			System.out.println("The array is a palindrome.");
		} else {
			System.out.println("The array is not a palindrome.");
		}
	}
	public static boolean checkPalindrome(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while(left < right) {
			if(arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
