// Max Circular Subarray Sum
// Problem Statement:Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.
// Examples:
// Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
// Output: 22
// Explanation: Starting from the last element of the array, i.e, 12, and moving in a circular fashion, we have max subarray as 12, 8, -8, 9, -9, 10, which gives maximum sum as 22.


class Solution {
    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int min(int arr[]){
        int n=arr.length;
        int currmin=arr[0];
        int minsum=arr[0];
        for(int i=1;i<n;i++){
            currmin=Math.min(arr[i] , currmin+arr[i]);
            minsum=Math.min(currmin,minsum);
        }
        return minsum;
    }
    public int max(int arr[]){
        int n=arr.length;
        int currmax=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<n;i++){
            currmax=Math.max(arr[i], currmax+arr[i]);
            maxsum=Math.max(currmax,maxsum);
        }
        return maxsum;
    }
    public int circularSubarraySum(int arr[]) {
        int n=arr.length;
        int maxnormal = max(arr);
        int minnormal = min(arr);
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        if(maxnormal<0){
            return maxnormal;
        }
        else{
            int circularSum = sum-minnormal;
            return Math.max(maxnormal,circularSum);
        }
    }
}
