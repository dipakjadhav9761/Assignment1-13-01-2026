package AssingmentArray;
import java.util.Arrays;
public class DistinctElement {
	public class SecondLargest {
	    public static void main(String[] args) {
	        int[] arr = {10, 20, 30, 40, 50, 50};
	        System.out.println("Second largest element: " + findSecondLargest(arr));
	    }

	    public static int findSecondLargest(int[] arr) {
	        // Remove duplicates and sort the array
	        int[] distinctArr = Arrays.stream(arr).distinct().toArray();
	        Arrays.sort(distinctArr);

	        // Check if array has at least two elements
	        if (distinctArr.length < 2) {
	            throw new RuntimeException("Array should have at least two distinct elements");
	        }

	        // Return the second largest element
	        return distinctArr[distinctArr.length - 2];
	    }
	}
}