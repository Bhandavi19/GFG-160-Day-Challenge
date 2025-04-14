// Smallest Positive Missing
// Probelm statement:You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.
// Note: Positive number starts from 1. The array can have negative integers too.
// Examples:
// Input: arr[] = [2, -3, 4, 1, 1, 7]
// Output: 3
// Explanation: Smallest positive missing number is 3.

class Solution {
    public int missingNumber(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int missing=1;
        while(hs.contains(missing)){
            missing++;
        }
        return missing;
    }
}
