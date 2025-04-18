// Second Largest
// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
// Note: The second largest element should not be equal to the largest element.
// Examples:
// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.

class Solution {
    public int getSecondLargest(int[] arr) {
        
        Arrays.sort(arr);
        
        int n = arr.length;
        int k=2;
        int ans=-1;
        int index=0;
        
        for(int i=n-1 ;i>0;i--){
            if(arr[i] != arr[i-1]){
                index++;
            }
            if(index == k-1){
                ans = arr[i-1];
            }
        }
        return ans;
    }
}
