class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 1;i<m;i++){
         for(int j =0;j<i;j++){
         int temp = matrix[i][j];
         matrix[i][j] = matrix[j][i];
         matrix[j][i] = temp;
         }
        }
        for(int i=0;i<m;i++){
            int st = 0;
     int ep = m-1;
      while(st<=ep){
     
     int temp = matrix[i][st];
     matrix[i][st] = matrix[i][ep];
     matrix[i][ep] = temp;

     st++;
     ep--;

      }}
        }
    }
