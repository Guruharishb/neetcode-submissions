class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][]rows=new boolean[9][9];
        boolean [][]col=new boolean[9][9];
        boolean [][]box=new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                int bi=(i/3)*3+(j/3);
                int val=board[i][j]-'1';
                if(rows[i][val] || col[j][val] ||box[bi][val]) return false;
                rows[i][val]=true; col[j][val]=true; box[bi][val]=true;
                }
            }
        }
        return true;
    }
}
