class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            if(!rowValid(board, i) || !colValid(board, i)) return false;
        }

        for(int row = 0; row < 9; row += 3){
            for(int col = 0; col < 9; col += 3){
                if(!boxValid(board, row, col)) return false;
            }
        }
        
        return true;
    }

    private boolean rowValid(char[][] board, int row){
        boolean[] map = new boolean[10];

        for(int i = 0; i < 9; i ++){
            if(board[row][i] == '.') continue;
            if(map[board[row][i] - '0']) return false;

            map[board[row][i] - '0'] = true;
        }
        return true;

    }

    private boolean colValid(char[][] board, int col){
        boolean[] map = new boolean[10];

        for(int i = 0; i < 9; i ++){
            if(board[i][col] == '.') continue;
            if(map[board[i][col] - '0']) return false;

            map[board[i][col] - '0'] = true;
        }
        return true;

    }
    
    private boolean boxValid(char[][] board, int row, int col){
        boolean[] map = new boolean[10];

        for(int i = row; i < row+3; i++){
            for(int j = col; j < col+3; j++){
                if(board[i][j] == '.') continue;
                if(map[board[i][j] - '0']) return false;

                map[board[i][j] - '0'] = true;
            }
        }
        
        return true;
    }
}
