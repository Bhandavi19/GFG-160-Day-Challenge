// Search in Rotated Sorted Array
// Problem Statement : Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. Return -1 if the key is not found.
// Examples :
// Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
// Output: 8
// Explanation: 3 is found at index 8.

class Solution {
    int search(int[] arr, int key) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
