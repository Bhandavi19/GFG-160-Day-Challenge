// Set Matrix Zeroes
// Problem Statement : You are given a 2D matrix mat[][] of size n×m. The task is to modify the matrix such that if mat[i][j] is 0, all the elements in the i-th row and j-th column are set to 0 and do it in constant space complexity.
// Examples:
// Input: mat[][] = [[1, -1, 1],
//                 [-1, 0, 1],
//                 [1, -1, 1]]
// Output: [[1, 0, 1],
//         [0, 0, 0],
//         [1, 0, 1]]
// Explanation: mat[1][1] = 0, so all elements in row 1 and column 1 are updated to zeroes.

class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        boolean[] row = new boolean[r];
        boolean[] col = new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j] == 0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i] || col[j]){
                    mat[i][j]=0;
                }
            }
        }
    }
}
