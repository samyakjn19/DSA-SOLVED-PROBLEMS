class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
     

    while(low <= high){
           int m = (low+high)/2;
   if(nums[m] == target){
    return m;

   }
   if(nums[m] >target){
    high = m-1;
   }
   if(nums[m]<target){
    low = m+1;
   }

    }

    return -1;



        
    }
}