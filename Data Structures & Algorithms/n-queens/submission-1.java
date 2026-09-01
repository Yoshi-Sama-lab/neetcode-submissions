class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        class Solver{
            void backtrack(int row){
                if(row==n){
                    List<String> inner=new ArrayList<>();
                    for(int i=0;i<n;i++){
                        inner.add(new String(board[i]));
                    }
                    output.add(inner);
                    return;
                }
                for(int col=0;col<n;col++){
                    boolean isSafe=true;
                    for(int i=0;i<n;i++){
                        if(board[i][col]=='Q'){
                            isSafe=false;
                        }
                    }
                    if(isSafe){
                        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                            if(board[i][j]=='Q'){
                                isSafe=false;
                            }
                        }
                    }
                    if(isSafe){
                        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
                            if(board[i][j]=='Q'){
                                isSafe=false;
                            }
                        }
                    }
                    if(isSafe){
                        board[row][col]='Q';
                        backtrack(row+1);
                        board[row][col]='.';
                    }
                }

            }
        }
        new Solver().backtrack(0);
        return output;
    }
}
