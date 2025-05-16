// Longest Consecutive Subsequence
// Problem Statement : Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
// Examples:
// Input: arr[] = [2, 6, 1, 9, 4, 5, 3]
// Output: 6
// Explanation: The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.

class Solution {

    public int longestConsecutive(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int res = 0;
        for(int num:arr){
            if(!hs.contains(num-1)){
                int currnum = num;
                int count=1;
                
                while(hs.contains(currnum+1)){
                    currnum++;
                    count++;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}
