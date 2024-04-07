package randd;

public class Program15 {
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17};
		int target = 13;
		int index = binarySearch(array, target);
		if(index != -1) {
			System.out.println("Element " + target + " found at index " + index);
		} else {
			System.out.println("Element " + target + " not found in the array.");
		}
	}
	public static int binarySearch(int[] array, int target) {
		return binarySearchHelper(array, target, 0, array.length - 1);
	}
	public static int binarySearchHelper(int[] array, int target, int low, int high) {
		if(low <= high) {
			int mid = low + (high - low) / 2;
			if(array[mid] == target) {
				return mid;
			} else if(array[mid] < target) {
				return binarySearchHelper(array, target, mid + 1, high);
			} else {
				return binarySearchHelper(array, target, low, mid - 1);
			}
		}
		return -1;
	}

}
