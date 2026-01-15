package AssingmentArray;
import java.util.Scanner;
import java.util.ArrayList;

public class PresentOrNot {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        //  array size to user
	        System.out.print("Enter array size: ");
	        int size = scanner.nextInt();

	        // Create array
	        int[] array = new int[size];

	        // Get array elements to user
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Get element to search
	        System.out.print("Enter element to search: ");
	        int target = scanner.nextInt();

	        // Check if element is present
	        boolean found = false;
	        for (int i = 0; i < size; i++) {
	            if (array[i] == target) {
	                found = true;
	                break;
	            }
	        }

	        // Print result
	        if (found) {
	            System.out.println(target + " is present in the array.");
	        } else {
	            System.out.println(target + " is not present in the array.");
	        }

	        scanner.close();
	    }
	}
