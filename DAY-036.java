// Spirally traversing a matrix
// Problem Statement : You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.
// Examples:
// Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
// Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

class Solution {
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> res = new ArrayList<>();
        int r = mat.length;
        int c = mat[0].length;
        int top=0,bottom=r-1,left=0,right=c-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                res.add(mat[top][i]);
            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                res.add(mat[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i=right ; i>=left ;i--){
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom ; i>=top ;i--){
                    res.add(mat[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
