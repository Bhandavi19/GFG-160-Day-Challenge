// Count Pairs whose sum is less than target
// Given an array arr[] and an integer target. You have to find the number of pairs in the array whose sum is strictly less than the target.
// Examples:
// Input: arr[] = [7, 2, 5, 3], target = 8
// Output: 2
// Explanation: There are 2 pairs with sum less than 8: (2, 5) and (2, 3). 

class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int count =0;
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        while(l<=r){
            if(arr[l]+arr[r] < target){
                count+=(r-l);
                l++;
            }
            else{
                r--;
            }
        }
        return  count;
    }
}
