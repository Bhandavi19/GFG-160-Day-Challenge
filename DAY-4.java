// Rotate Array:
// Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
// Note: Consider the array as circular.
// Examples :
// Input: arr[] = [1, 2, 3, 4, 5], d = 2
// Output: [3, 4, 5, 1, 2]
// Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.

  class Solution {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        if(d==0){
            return;
        }
        int temp[] = new int[d];
        int temp1[] = new int[n-d];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<arr.length;i++){
            temp1[i-d]=arr[i];
        }
        
        int i=0;
        while(i<n-d){
            arr[i]=temp1[i];
            i++;
        }
        int j=0;
        while(j<d){
            arr[i]=temp[j];
            i++;
            j++;
        }
    }
}
