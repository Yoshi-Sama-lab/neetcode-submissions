class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        
        for(int i=0;i<row;i++){
            int index=Arrays.binarySearch(matrix[i],target);
            if(index>=0) return true;
        }
        return false;
    }
}
