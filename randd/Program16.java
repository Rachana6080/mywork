package randd;

public class Program16 {
	public static void main(String[] args) {
		int[] array = {3, 8, 1, 9, 4, 6};
		int[] largestTwo = findLargestTwo(array);
		System.out.println("First largest element: " + largestTwo[0]);
		System.out.println("Second largest element: " + largestTwo[1]);
	}
	public static int[] findLargestTwo(int[] arr) {
		if(arr.length < 2) {
			System.out.println("Array must have at least two elements");
			return null;
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > largest) {
				secondLargest = largest;
				largest = num;
			} else if(num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}
		if(secondLargest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element");
			return null;
		} else {
			int[] result = {largest, secondLargest};
			return result;
		}
	}

}
