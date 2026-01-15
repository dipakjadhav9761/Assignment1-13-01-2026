package AssingmentArray;
import java.util.Arrays;
public class NegativeElement {
	public class NegativeToZero {
	    public static void main(String[] args) {
	        int[] arr = {-1, 2, -3, 4, -5, 6};
	        System.out.println("Original array: " + Arrays.toString(arr));

	        arr = Arrays.stream(arr).map(n -> n < 0 ? 0 : n).toArray();
	        System.out.println("Updated array: " + Arrays.toString(arr));
	    }
	}

}
