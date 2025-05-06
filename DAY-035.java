// Kth Missing Positive Number in a Sorted Array
// Problem Statement : Given a sorted array of distinct positive integers arr[], we need to find the kth positive number that is missing from arr[].  
// Examples :
// Input: arr[] = [2, 3, 4, 7, 11], k = 5
// Output: 9
// Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.

//used HashSet to solve the problem

  class Solution {
    public int kthMissing(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            hs.add(arr[i]);
        }
        int missing=1;
        int res=0;
        while(true){
            if(!hs.contains(missing)){
                k--;
                if(k==0){
                    res=missing;
                    break;
                }
            }
            missing++;
        }
        return res;
    }
}
