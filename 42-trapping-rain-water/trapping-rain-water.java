class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] premax = new int[n];
        premax[0] = height[0];
        int[] postmax = new int[n];
        postmax[n-1] = height[n-1];
         for(int i=1;i<n;i++){
            premax[i] = Math.max(premax[i-1],height[i]);
         }
         for(int i=n-2;i>=0;i--){
            postmax[i] = Math.max(postmax[i+1],height[i]);
         }
         int count  = 0;
         for(int i = 0;i<n;i++){
            int p = Math.min(premax[i],postmax[i]);
            int r=p-height[i];
             if(r>0){
             count = count + r;}
             }




         return count;
        
    }
}