class Solution {
    public boolean isValidSudoku(char[][] board) {
        return Suduko(board,0,0);
    }
    public boolean Suduko(char[][] board,int row , int col){
        if(row == 9){
            return true;
        }
        int nextRow = row ; 
        int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(board[row][col] == '.'){
            return Suduko(board,nextRow,nextCol);
        }
         char digit=board[row][col];
            if(isSafe(board,row,col,digit)){
                if(Suduko(board,nextRow,nextCol)){
                    return true;
                }
            }
        return false;
    }
    public boolean isSafe(char[][] board,int row , int col, int digit){
        for(int i=0 ;i<8 ;i++){
            if(i==row){
                continue;
            }else if(board[i][col] == digit){
                return false;
            }
        }
        for(int j=0 ;j<9 ; j++){
            if(j==col){
                continue;
            }else if(board[row][j] == digit){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr ;i<sr+3 ; i++){
            for(int j=sc ; j<sc+3 ; j++){
                if(i==row || j==col){
                    continue;
                }else if(board[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
}