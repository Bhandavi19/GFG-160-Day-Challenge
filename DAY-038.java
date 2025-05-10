// Search in a Row-Column sorted matrix
// Problem Statement : Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix
// Examples:
// Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
// Output: false
// Explanation: 62 is not present in the matrix, so output is false.

//used binary search to find the element
  
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int n=mat.length;
        int m=mat[0].length;
        int r=0,c=m-1;
        while(r<n && c>=0){
            if(mat[r][c] == x){
                return true;
            }
            else if(mat[r][c] > x){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}
