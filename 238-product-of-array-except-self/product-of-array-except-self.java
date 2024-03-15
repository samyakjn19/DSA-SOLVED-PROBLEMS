class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int suffix = 1;
        int[] arr = new int[n];

        arr[0] = nums[0];
        for(int i =1;i<n;i++){
            arr[i] = arr[i-1]*nums[i];
        }
        for(int i =n-1;i>=1;i--){
            
            arr[i] = arr[i-1]*suffix;
            suffix = suffix*nums[i];
           
        }
        arr[0] = suffix;
        
       

       return arr; 
    }
}