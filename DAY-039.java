// Search in a row-wise sorted matrix
// Problem Statement : Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
// Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].
// Examples:
// Input: mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9
// Output: true
// Explanation: 9 is present in the matrix, so the output is true.

class Solution {
    public boolean valid(int mat[],int x){
        int l=0,r=mat.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(mat[m] == x){
                return true;
            }
            else if(mat[m] < x){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return false;
    }
    public boolean searchRowMatrix(int[][] mat, int x) {
        int r = mat.length;
        for(int i=0;i<r;i++){
            if(valid(mat[i] , x)){
                return true;
            }
        }
        return false;
    }
}
