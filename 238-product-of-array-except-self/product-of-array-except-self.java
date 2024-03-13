class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] parr = new int[n];
        parr[0] = nums[0];

        for(int i = 1;i<n;i++){
            parr[i] = parr[i-1]*nums[i];
        }
     int prefix = 1;
     for(int i = n-1;i>0;i--){
            parr[i] = parr[i-1]*prefix;
            prefix = prefix*nums[i];
            

        }
        parr[0] = prefix;

        

     return parr;

    }
}

// int[] parr = new int[nums.length];
        
//         for(int i = 0;i<nums.length;i++){
//             int product = 1;
//             for(int j =0;j<nums.length;j++){
//                 if(j==i){
//                     continue;
//                 }
//             product = product*nums[j];
//           parr[i] = product;
//           }


//         }
//         return parr;