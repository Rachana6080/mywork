package randd;
import java.util.Arrays;
public class Program18 {
	public static void main(String[] args) {
		int[] array = {5, 8, 3, 1, 9, 2, 7, 4, 6};
		System.out.println("Array: " + Arrays.toString(array));
		double mean = calculateMean(array);
		double median = calculateMedian(array);
		double variance = calculateVariance(array, mean);
		double stdDeviation = Math.sqrt(variance);
		System.out.println("Mean: " + mean);
		System.out.println("Median: " + median);
		System.out.println("Variance: " + variance);
		System.out.println("Standard Deviation: " + stdDeviation);
	}
	public static double calculateMean(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return(double) sum / arr.length;
	}
	public static double calculateMedian(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		if(n % 2 == 0) {
			return(double) (arr[n / 2 - 1] + arr[n / 2]) / 2;
		} else {
			return arr[n / 2];
		}
	}
	public static double calculateVariance(int[] arr, double mean) {
		double sumSquaredDiff = 0;
		for(int num : arr) {
			sumSquaredDiff += Math.pow(num - mean,  2);
		}
		return sumSquaredDiff / arr.length;
	}
    
}
