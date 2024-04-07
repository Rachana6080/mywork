package randd;

public class Program11 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int i = 2;
		int j = 5;
		removeElements(array, i, j);
		for(int num : array) {
			System.out.println(num + " ");
		}
}
	public static void removeElements(int[] arr, int i, int j) {
		if(i < 0 || j >= arr.length) {
			System.out.println("Invalid indices");
			return;
		}
		int newLength = arr.length - (j - i + 1);
		int[] newArr = new int[newLength];
		System.arraycopy(arr, 0, newArr, 0, i);
		System.arraycopy(arr,  j + 1, newArr, i, arr.length - j - 1);
		System.arraycopy(newArr, 0, arr, 0, newLength);
	}
}