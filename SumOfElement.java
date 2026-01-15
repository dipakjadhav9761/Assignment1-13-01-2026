package AssingmentArray;

public class SumOfElement {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int k = 3; // number of consecutive elements
	        System.out.println("Maximum sum of " + k + " consecutive elements: " + maxConsecutiveSum(arr, k));
	    }

	    public static int maxConsecutiveSum(int[] arr, int k) {
	        if (arr.length < k) {
	            throw new RuntimeException("Invalid input: k is larger than array length");
	        }

	        int windowSum = 0;
	        for (int i = 0; i < k; i++) {
	            windowSum += arr[i];
	        }

	        int maxSum = windowSum;
	        for (int i = k; i < arr.length; i++) {
	            windowSum = windowSum - arr[i - k] + arr[i];
	            maxSum = Math.max(maxSum, windowSum);
	        }

	        return maxSum;
	    }
	}


