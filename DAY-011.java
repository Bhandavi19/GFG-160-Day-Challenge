// Maximum Product Subarray
// Problem Statement : Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].
// Note: It is guaranteed that the output fits in a 32-bit integer.
// Examples
// Input: arr[] = [-2, 6, -3, -10, 0, 2]
// Output: 180
// Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180.


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int minpro = arr[0];
        int maxpro = arr[0];
        int result = arr[0];
        for(int i=1;i<n;i++){
            
            if(arr[i] == 0){
                minpro = 0;
                maxpro = 0;
                result = Math.max(result,0);
                continue;
            }
            int tempmax = maxpro;
            maxpro = Math.max(arr[i] ,Math.max(tempmax*arr[i] , arr[i]*minpro));
            minpro = Math.min(arr[i] ,Math.min(minpro*arr[i] , arr[i]*tempmax));
            
            result = Math.max(result,maxpro);
        }
        return result;
    }
}
