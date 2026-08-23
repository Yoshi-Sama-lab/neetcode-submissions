class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] columns=new HashSet[9];
        HashSet<Character>[] blocks=new HashSet[9];
        
        for(int i=0;i<9;i++){
            rows[i]= new HashSet<>();
            columns[i]= new HashSet<>();
            blocks[i]= new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char number=board[i][j];
                int blockindex= (i/3) * 3+ (j/3);
                if(number !='.'){
                    if(!rows[i].add(number)||!columns[j].add(number)||!blocks[blockindex].add(number)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
