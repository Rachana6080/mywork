//Given an integer array of size N, which has only values 0's and 1's. sort the array.

package practice;

import java.util.Arrays;

public class program9 {
	public static void sortBinaryArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return; // Nothing to sort
        }

        int left = 0; // Left pointer
        int right = nums.length - 1; // Right pointer

        while (left < right) {
            // Move left pointer until it encounters 1
            while (left < right && nums[left] == 0) {
                left++;
            }
            // Move right pointer until it encounters 0
            while (left < right && nums[right] == 1) {
                right--;
            }
            // Swap the values at left and right pointers
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, 1, 0};
        System.out.println("Original Array: " + Arrays.toString(nums));
        sortBinaryArray(nums);
        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }

}
