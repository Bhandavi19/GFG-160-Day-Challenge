// Two Sum - Pair with Given Sum
// Problem Statement : Given an array arr[] of positive integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.
// Examples:
// Input: arr[] = [1, 4, 45, 6, 10, 8], target = 16
// Output: true
// Explanation: arr[3] + arr[4] = 6 + 10 = 16.

class Solution {
    boolean twoSum(int arr[], int target) {
        boolean valid = false;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int temp = target - arr[i];
            if(hs.contains(temp)){
                valid = true;
                break;
            }
            hs.add(arr[i]);
        }
        return valid;
    }
}
