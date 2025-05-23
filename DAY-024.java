// Overlapping Intervals
// Problem Statement : Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.
// Examples:
// Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
// Output: [[1,4], [6,8], [9,10]]
// Explanation: In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will return [[1,4], [6,8], [9,10]].

class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(arr , (a,b) -> a[0]-b[0]);
        
        for(int[] i : arr){
            if(res.isEmpty() || res.get(res.size()-1)[1] < i[0]){
                res.add(i);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1] , i[1]);
            }
        }
        return res;
    }
}
