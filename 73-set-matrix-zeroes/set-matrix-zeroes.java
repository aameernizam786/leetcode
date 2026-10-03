class Solution {
    public void setZeroes(int[][] matrix) {
      ArrayList<Integer> row = new ArrayList<>();
      ArrayList<Integer> col =new ArrayList<>();
      findRowCol(matrix,0,0,row,col);
      for(int i=0;i<row.size();i++){
        setZero(matrix,row.get(i),col.get(i));
      }
    }
    public static void setZero(int[][] matrix,int row,int col){
        for(int j=0;j<matrix[0].length ; j++){
            matrix[row][j]=0;
        }
        for(int i=0 ;i<matrix.length ; i++){
            matrix[i][col]=0;
        }
    }
    public static void findRowCol(int[][] matrix , int row , int col ,ArrayList<Integer> list1 ,ArrayList<Integer> list2){
        if(row==matrix.length){
            return ;
        }
        int nextRow=row;
        int nextCol=col+1;
        if(col+1==matrix[0].length){
            nextCol=0;
            nextRow=row+1;
        }

        if(matrix[row][col] != 0){
            findRowCol(matrix,nextRow,nextCol,list1,list2);
        }else{
            list1.add(row);
            list2.add(col);
        findRowCol(matrix,nextRow,nextCol,list1,list2);
        }

    }
}