public class WordSeach {

    public static boolean [][] visited;
    public static void main(String[] args) {
        char [][] board = {{'A','B','C','E'},
                            {'S','F','C','S'},
                            {'A','D','E','E'}};

        String word = "ABCCED";

        System.out.println(exist(board, word));
        
    }

    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            }
        }
        return false;
    }

    public static boolean check(char [][] board, String word, int i, int j,
                                    int m, int n, int curr){
        if(curr >=word.length()){
            return true;
        }

        if(i<0 || j<0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(curr)){
            return false;
        }

        if(board[i][j]==word.charAt(curr)){
            board[i][j]+=100;
        }
        boolean result = check(board, word, i+1, j, m, n, curr+1) ||
                            check(board, word, i-1, j, m, n, curr+1) || 
                            check(board, word, i, j+1, m, n, curr+1) ||
                            check(board, word, i, j-1, m, n, curr);
        board[i][j]-=100;

        return result;
    }

}
