// Find H-Index
// Problem Statement : Given an integer array citations[], where citations[i] is the number of citations a researcher received for the ith paper. The task is to find the H-index.
// H-Index is the largest value such that the researcher has at least H papers that have been cited at least H times.
// Examples:
// Input: citations[] = [3, 0, 5, 3, 0]
// Output: 3
// Explanation: There are at least 3 papers (3, 5, 3) with at least 3 citations.

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int count = 0;
        int arr2[] = new int[n];
        Arrays.sort(citations);
        int j=0;
        for(int i=n-1;i>=0;i--){
            arr2[j] = citations[i];
            j++;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i] >= i+1){
                count++;
            }
        }
        return count;
    }
}
