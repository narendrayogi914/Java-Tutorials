//Time Complexity : O(n)
//Spcae Complexity : O(1)

class Palindrome{
    public static void main(String[] args) {

        int array[] = {1,2,3,2,4};
        int n = array.length;
        int flag  = 0;
        for (int i = 0; i < n/2; i++) {
            if (array[i]!= array[n-1-1]){
                flag =1;
                System.out.println("Not a palindrome Array");
                break;    
            }

        }
        if (flag==0) {
            System.out.println("Palindromic Array");

        }


        
    }

}