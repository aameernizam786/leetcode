class Solution {
    public int[][] generateMatrix(int n) {
        int temp[][]=new int[n][n];
        int sr=0;
        int er=n-1;
        int sc=0;
        int ec=n-1;
        int k=1;
        while(sr<=er && sc<=ec){
            for(int j=sc ; j<=ec ; j++){
                 temp[sr][j]=k;
                 k++;
            }
            for(int i=sr+1;i<=er; i++){
                temp[i][ec]=k;
                k++;
            }
            for(int j=ec-1 ;j>=sc ; j--){
                temp[er][j]=k;
                k++;
            }
            for(int i=er-1; i>=sr+1 ; i--){
                temp[i][sc]=k;
                k++;
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return temp;
    }
}