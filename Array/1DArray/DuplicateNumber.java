// Time Complexity : O(n^2)

// Space Complexity: O(1)


public class DuplicateNumber {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 2};
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate Number is " + a[i]);

                }
                
            }
            
        }
        

    }
}
