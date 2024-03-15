class Solution {
    public int maxProduct(int[] nums) {
        int productf = 1;
        int productb = 1;
        int ansf = Integer.MIN_VALUE;
        int ansb = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(productf==0){
                productf = nums[i];
                
            }
            else{
                productf = productf*nums[i];}
            
            ansf = Math.max(ansf,productf);
        }
        for(int i =nums.length-1;i>=0;i--){
            if(productb==0){
                productb = nums[i];
                
            }
            else{
                productb = productb * nums[i];}
            
            ansb = Math.max(ansb,productb);
        }

        return Math.max(ansb,ansf);

        
    }
}