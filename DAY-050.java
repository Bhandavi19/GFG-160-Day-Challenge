// Count Subarrays with given XOR
// Given an array of integers arr[] and a number k, count the number of subarrays having XOR of their elements as k.
// Examples: 
// Input: arr[] = [4, 2, 2, 6, 4], k = 6
// Output: 4
// Explanation: The subarrays having XOR of their elements as 6 are [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], and [6]. Hence, the answer is 4.

class Solution {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count=0;
        int prefixXOR = 0;
        for(int num:arr){
            prefixXOR ^= num;
            
            if(prefixXOR == k){
                count++;
            }
            int req = prefixXOR^k;
            if(hm.containsKey(req)){
                count += hm.get(req);
            }
            hm.put(prefixXOR , hm.getOrDefault(prefixXOR,0)+1);
        }
        return count;
    }
}
