// Time Complexity = O(n)
// Space Complexity = O(1)

public class Reversal {
    public static void main(String[] args) {
        int arr[] = {4,5,7,8,6};
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            //swap the elements between arr[i] && arr[ni-1-1]
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;

        }
        System.out.println("Reversal of An array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
