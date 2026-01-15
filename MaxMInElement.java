package AssingmentArray;

public class MaxMInElement {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50};
	        findMaxMin(arr);
	    }

	    public static void findMaxMin(int[] arr) {
	        if (arr.length == 0) {
	            System.out.println("Array is empty");
	            return;
	        }

	        int max = arr[0];
	        int min = arr[0];
//loop
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            } else if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
//Min-Max element
	        System.out.println("Maximum element: " + max);
	        System.out.println("Minimum element: " + min);
	    }
	}


