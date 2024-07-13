package Searching;

public class LowerBound {
    public static int lowerBound(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                result = mid; // Record the current position
                high = mid - 1; // Look for a lower index
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int x = 2;
        int index = lowerBound(arr, x);
        if (index != -1) {
            System.out.println("The first occurrence of " + x + " is at index: " + index);
        } else {
            System.out.println(x + " is not present in the array.");
        }
    }
}

