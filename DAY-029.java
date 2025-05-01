// Sorted and Rotated Minimum
// Problem Statemnt : A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it. 
// Examples:
// Input: arr[] = [5, 6, 1, 2, 3, 4]
// Output: 1
// Explanation: 1 is the minimum element in the array.

class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=Math.min(arr[i],min);
            }
        }
        return min;
    }
}
