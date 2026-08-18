class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] arr = {-1,-1};
         int value = 0;
        for(int i=0;i<row;i++){
           
            for(int j=0;j<col;j++){
                if(mat[i][j]>value){
                    value = mat[i][j];
                    arr[0]=i;
                    arr[1]=j;
               }
            }
        }
        return arr;
    }
}