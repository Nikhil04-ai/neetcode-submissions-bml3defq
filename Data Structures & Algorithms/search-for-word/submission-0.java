class Solution {

    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                if(dfs(board, word, i, j, 0))
                    return true;

            }
        }

        return false;
    }

    private boolean dfs(char[][] board , String word , int r , int c , int k ){


        if(k == word.length()) return true;

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length 
           || board[r][c] != word.charAt(k)){
            return false;
        }

   
        char temp = board[r][c];
        board[r][c] = '*';

      
        boolean found = dfs(board , word , r+1 , c , k+1) ||
                        dfs(board , word , r-1 , c , k+1) ||
                        dfs(board , word , r , c+1 , k+1) ||
                        dfs(board , word , r , c-1 , k+1);

       
        board[r][c] = temp;

    
        return found;
    }
}