//Given an integer array of size N, write a function to return the Maximum and Minimum values of the array.

package practice;

public class program10 {
	public static int[] findMaxMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {0, 0}; // Return 0s if array is empty
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[] {max, min};
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 9, 4, 8, 2};
        int[] result = findMaxMin(nums);
        System.out.println("Maximum value: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
    }

}
