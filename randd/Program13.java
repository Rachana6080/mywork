package randd;
import java.util.Arrays;
public class Program13 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		int value = 3;
		int[] rotatedArray = leftRotate(array, value);
		System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
	}
	public static int[] leftRotate(int[] array, int value) {
		int length = array.length;
		int[] rotatedArray = new int[length];
		int rotationIndex = value % length;
		System.arraycopy(array, rotationIndex, rotatedArray, 0, length - rotationIndex);
		System.arraycopy(array,  0,  rotatedArray, length - rotationIndex, rotationIndex);
		return rotatedArray;
	}

}
