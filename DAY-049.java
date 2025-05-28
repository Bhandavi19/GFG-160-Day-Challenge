// Subarrays with sum K
// Given an unsorted array of integers, find the number of subarrays having sum exactly equal to a given number k.
// Examples:
// Input: arr = [10, 2, -2, -20, 10], k = -10
// Output: 3
// Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.

class Solution {
    public int countSubarrays(int arr[], int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int ans=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
            if(hm.containsKey(ans-k)){
                count+=hm.get(ans-k);
            }
            hm.put(ans,hm.getOrDefault(ans,0)+1);
        }
        return count;
    }
}
