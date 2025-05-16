// Intersection of Two arrays with Duplicate Elements
// Problem Statement : Given two integer arrays a[] and b[], you have to find the intersection of the two arrays. Intersection of two arrays is said to be elements that are common in both arrays. The intersection should not have duplicate elements and the result should contain items in any order.
// Note: The driver code will sort the resulting array in increasing order before printing.
// Examples:
// Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
// Output: [1, 3]
// Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.

class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs1.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            hs2.add(b[i]);
        }
        for(int num:hs1){
            if(hs2.contains(num)){
                arr.add(num);
            }
        }
        return arr;
    }
}
