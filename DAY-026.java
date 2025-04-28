// Non-overlapping Intervals
// Given a 2D array intervals[][] of representing intervals where intervals [i] = [starti, endi ]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.
// Examples:
// Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
// Output: 1
// Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.

class Solution {
    static int minRemoval(int intervals[][]) {
        int count=0;
        int end = Integer.MIN_VALUE;
        Arrays.sort(intervals , (a,b) -> a[1]-b[1]);
        for(int[] i : intervals){
            if(i[0] < end){
                count++;
            }
            else{
                end = i[1];
            }
        }
        return count;
    }
}
