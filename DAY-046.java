// Union of Arrays with Duplicates
// Problem Statement : Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.
// The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.
// Note: Elements of a[] and b[] are not necessarily distinct.
// Examples:
// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
// Output: 5
// Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.

  
class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(a[i] , hm.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++){
            hm.put(b[i] , hm.getOrDefault(b[i],0)+1);
        }
        return hm.size();
    }
}
