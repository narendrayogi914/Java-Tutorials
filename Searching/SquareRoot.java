//TIme Complexity = O(log n )
//Space Complexity = O(1)

package Searching;

import java.util.Scanner;

public class SquareRoot {

    public static int findSquareRoot(int num)
    {
        int low = 0,high = num, result = -1;

        //modified binary searching 
        while(low <= high){
            int mid = low + (high-low)/2;
            long val = mid * mid ;
            if(val == num){
                //perfect square root 
                return mid;
            }
            else if(val < num){
                //store the floor value , incase the number is not perfect squarea root  , we can print the floor value
                result = mid;
                low = mid+1;

            }
            else{
                high = mid-1;
            }
        

        }
        return result;
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to square root: ");
        int n = sc.nextInt();


        //function calling 
        int result = findSquareRoot(n);
        System.out.println("Square root of " + n + " is " + result);

        sc.close();

    }
    
}
