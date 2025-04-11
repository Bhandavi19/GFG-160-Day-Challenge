// Problem Statement:Kadane's Algorithm
// Given an integer array arr[]. You need to find the maximum sum of a subarray.
// Examples:
// Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output: 11
// Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

class Solution {
    int maxSubarraySum(int[] arr) {
        int maxsum=Integer.MIN_VALUE;
        int n=arr.length;
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            maxsum=Math.max(maxsum,currsum);
            //if the currsum becomes '0' again initialize to zero and remove the elements by which the currsum is becoming zero
            if(currsum<0){
                currsum=0;
            }
        }
        return maxsum;
    }
}
