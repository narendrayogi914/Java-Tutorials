//Time Complexity = O(n)
//Space Complexity = O(1)


package Searching;
import java.util.Scanner;


public class LinearSearch {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n =sc.nextInt();
        System.out.println("Enter the element ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
        }
        System.out.println("Enter the target element in array");
        int key = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i]==key) {
                idx = i;
                break;
            }

            
        }
        if (idx == -1) {
            System.out.println("Search element is not found");

        }
        else{
            System.out.println("Searched element is found  at the location " + idx);
        }
        sc.close();
    }
    
}
