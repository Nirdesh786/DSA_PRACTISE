class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length;
        int col = matrix[0].length;

        int[] arr = new int[row*col];
        int index = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[index++] = matrix[i][j];
            }
        }
        index = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 matrix[i][j]=arr[index++];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}