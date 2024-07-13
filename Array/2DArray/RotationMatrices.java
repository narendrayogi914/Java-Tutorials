

import java.util.Arrays;

 class Rotatation2DArray {
    public static void rotatedMatrix(int[][] arr) {
        // Step 1: Transpose 2D Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Swap the left and right side elements
        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = arr[0].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}

public class RotationMatrices {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        // Function call
        Rotatation2DArray.rotatedMatrix(arr);

        // Display Array
        for (int[] mat : arr) {
            System.out.println(Arrays.toString(mat));
        }
    }
}
