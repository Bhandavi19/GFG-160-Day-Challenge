// Count pairs with given sum
// Problem Statement : Given an array arr[] and an integer target. You have to find numbers of pairs in array arr[] which sums up to given target.
// Examples:
// Input: arr[] = [1, 5, 7, -1, 5], target = 6 
// Output: 3
// Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
// Input: arr[] = [1, 1, 1, 1], target = 2 
// Output: 6
// Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).


class Solution {

    int countPairs(int arr[], int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            int temp = target - arr[i];
            if(hm.containsKey(temp)){
                count += hm.get(temp);
            }
            hm.put(arr[i] , hm.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
  
