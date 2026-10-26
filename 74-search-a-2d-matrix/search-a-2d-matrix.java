class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int si=0;
        int ei=row*col-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            int rw=mid/col;
            int cl=mid%col;
            if(matrix[rw][cl] == target){
                return true;
            }
            if(matrix[rw][cl] < target){
              si=mid+1;
            }else{
                ei=mid-1;
            }
        }
        return false;
    }
}