class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = candies.length;
        List<Boolean> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
         for(int i =0;i<m;i++){
            if(candies[i]>max){
                max = candies[i];
            }

         }
       
        for(int i =0;i<m;i++){
          if((candies[i]+ extraCandies)>= max){
            arr.add(true);

          }
          else{
             arr.add(false);
          }
        }

return arr;
    }
}