public class Array {
     public static void main(String[] args) {
        // int num[] ={4,5,3,2};
        
        // // System.out.println(num[2]);
        // // System.out.println(num[0]);
        // // System.out.println(num[1]);
        // for(int i =0 ; i<4;i++){
        //     System.out.print(num[i]+" ");

        // }

        int num[]= new int[4];
        String names[] ={"narendra","mayank","garvit","sachin"};
        for(int i=0;i<4;i++){
            System.out.print(names[i]+ " ");
        }
        int nums[]={5,3,7,6};
        System.out.println(nums[nums.length-1]);  // it will print the
        System.out.println("Bye");
        for(int  x : nums){
            System.out.println(x);
        }                // this is called as enhanced loop

     }
    
}
