public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,6,4,5};
        int n = arr.length;
        int sum_natural_number = (n+1)*(n+2)/2;
        int sum_array = 0;
        for (int i = 0; i < n; i++) {
            sum_array+=arr[i];
        }
        System.out.println("The Missing Number is " + (sum_natural_number-sum_array));
    }
}
