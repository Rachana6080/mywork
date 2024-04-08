package randd;
import java.util.Arrays;
public class Program17 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("Original array: " + Arrays.toString(array));
		int[] reversedArray = reverseArray(array);
		System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	}
	public static int[] reverseArray(int[] arr) {
		int length = arr.length;
		int[] reversedArray = new int[length];
		for(int i = 0; i < length; i++) {
			reversedArray[length - i - 1] = arr[i];
		}
		return reversedArray;
	}
}
