package randd;

public class Program12 {
	public static void main(String[] args) {
		int[] array = {1, -2, -3, 6, -4, -2, -1, 14, 2, 14};
		int maxNegativeChain = findMaxNegativeChain(array);
		System.out.println("Maximum chain of negative numbers: " + maxNegativeChain);
	}
		public static int findMaxNegativeChain(int[] array) {
			int maxChain = 0;
			int currentChain = 0;
			for(int num : array) {
				if(num < 0) {
					currentChain++;
				} else {
					maxChain = Math.max(maxChain, currentChain);
					currentChain = 0;
				}
			}
			maxChain = Math.max(maxChain, currentChain);
			return maxChain;
		

}
}