// Rotate by 90 degree
// Problem Statement : Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 
// Examples:
// Input: mat[][] = [[1, 2, 3],
//                 [4, 5, 6]
//                 [7, 8, 9]]
// Output: Rotated Matrix:
// [3, 6, 9]
// [2, 5, 8]
// [1, 4, 7]


class Solution {
    static void rotateby90(int mat[][]) {
        int r = mat.length;
      //transporing the matrix
        for(int i=0;i<r;i++){
            for(int j=i;j<r;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

      //next reversing the matrix
        for(int i=0;i<r;i++){
            int top=0,bottom=r-1;
            while(top<bottom){
                int temp = mat[top][i];
                mat[top][i] = mat[bottom][i];
                mat[bottom][i] = temp;
                top++;
                bottom--;
            }
        }
    }
}
