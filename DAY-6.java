// Majority Element II
// You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 
// Note: The answer should be returned in an increasing format.
// Examples:
// Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
// Output: [5, 6]
// Explanation: 5 and 6 occur more n/3 times.

class Solution {
    public List<Integer> findMajority(int[] nums) {
       int n=nums.length;
       HashMap<Integer,Integer> hs = new HashMap<>();
       ArrayList<Integer> a = new ArrayList<>();
       
       for(int i=0;i<n;i++){
           hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
       }
       
       for(int num : hs.keySet()){
           if(hs.get(num) > n/3){
               a.add(num);
           }
       }
       return a;
    }
}
