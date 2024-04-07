package randd;
import java.util.Arrays;
public class Program14 {
	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		//Bubble Sort
		int[] bubbleSortedArray = bubbleSort(array.clone());
	    System.out.println("Bubble Sort: " + Arrays.toString(bubbleSortedArray));
	    //Insertion Sort
	    int[] insertionSortedArray = insertionSort(array.clone());
	    System.out.println("Insertion Sort: " + Arrays.toString(insertionSortedArray));
	    //Selection Sort
	    int[] selectionSortedArray = selectionSort(array.clone());
	    System.out.println("Selection Sort: " + Arrays.toString(selectionSortedArray));
	    //Quick Sort
	    quickSort(array, 0, array.length - 1);
	    System.out.println("Quick Sort: " + Arrays.toString(array));
	    //Merge Sort
	    mergeSort(array.clone(), 0, array.length - 1);
	    System.out.println("Merge Sort: " + Arrays.toString(array));
	    System.out.println("Merge Sort: " + Arrays.toString(array));
	}
	//Bubble Sort
	public static int[] bubbleSort(int[] array) {
		int n = array.length;
		for(int i = 0; i < n- 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	//Insertion Sort
	public static int[] insertionSort(int[] array) {
		int n = array.length;
		for(int i = 1; i < n; ++i) {
			int key = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
		return array;
	}
	//Selection Sort
	public static int[] selectionSort(int[] array) {
		int n = array.length;
		for(int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for(int j = i + 1; j < n; j++) {
				if(array[j] < array[min_idx]) {
					min_idx = j;
				}
			}
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
		return array;
	}
	//Quick Sort
	public static void quickSort(int[] array, int low, int high) {
		if(low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}
	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low - 1);
		for(int j = low; j < high; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return i + 1;
	}
	//Merge Sort
	public static void mergeSort(int[] array, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
	}
	private static void merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i = 0; i < n1; ++i)
			L[i] = array[left + i];
		for(int j = 0; j < n2; ++j)
			R[j] = array[mid + 1 + j];
		int i = 0, j = 0;
		int k = left;
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}
}
