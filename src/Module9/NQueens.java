package Module9;


public class NQueens {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        solve(board,0,n);
    }
    public static boolean isSafe(char[][] board,int row,int col){
        int n=board.length;
        for (int i= 0; i < row; i++) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for (int i= row-1,j=col+1; i>=0 && j<n; i--, j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for (int i = row-1,j=col-1; i >=0 && j >=0; i--,j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void solve(char[][] board,int row,int n){
        if(row==n){
            printBoard(board,n);
            System.out.println();
            return;
        }
        for (int col = 0; col <n; col++) {
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                solve(board,row+1,n);
                board[row][col]='X';//Backtracking
            }
        }
    }
    public static void printBoard(char[][] board,int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}