class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; //Rows
        int n = matrix[0].length;//Cols
        int low = 0;
        int high = m*n-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int mid_row = mid/n, mid_col = mid%n;
            
            if (matrix[mid_row][mid_col]==target){
                return true;
            }
            else if(matrix[mid_row][mid_col]>target){
                high=mid-1;

            }
            else if (matrix[mid_row][mid_col]<target){
                low=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
