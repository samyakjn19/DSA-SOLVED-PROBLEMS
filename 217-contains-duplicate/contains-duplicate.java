class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashSet<Integer> h2 = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            h2.add(nums[i]);
            
        }
        if (nums.length>h2.size()){
            return true;
        }
        



           
            return false;


   }



        
    }
