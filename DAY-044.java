// Find All Triplets with Zero Sum
// Problem Statement : Given an array arr[], find all possible triplets i, j, k in the arr[] whose sum of elements is equals to zero. 
// Returned triplet should also be internally sorted i.e. i<j<k.
// Examples:
// Input: arr[] = [0, -1, 2, -3, 1]
// Output: [[0, 1, 4], [2, 3, 4]]
// Explanation: Triplets with sum 0 are:
// arr[0] + arr[1] + arr[4] = 0 + (-1) + 1 = 0
// arr[2] + arr[3] + arr[4] = 2 + (-3) + 1 = 0

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        HashSet<List<Integer>> res = new HashSet<>();

        for(int i=0;i<arr.length-2;i++){
            HashMap<Integer , List<Integer>> hm = new HashMap<>();
            for(int j=i+1;j<arr.length;j++){
                int temp = -(arr[i]+arr[j]);
                
                if(hm.containsKey(temp)){
                    for(int k : hm.get(temp)){
                        List<Integer> triplet =Arrays.asList(i,j,k);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                }
                hm.computeIfAbsent(arr[j],x -> new ArrayList<>()).add(j); // storing the index of j
            }
        }
        
        return new ArrayList<>(res);
    }
}
