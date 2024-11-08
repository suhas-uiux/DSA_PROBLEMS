// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
 
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        Set<Integer> rowSet=new HashSet<Integer>();
        Set<Integer> colSet=new HashSet<Integer>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rowSet.contains(i) || colSet.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}
