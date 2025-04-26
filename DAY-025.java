// Insert Interval
// Problem Statement : Geek has an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith event and intervals is sorted in ascending order by starti. He wants to add a new interval newInterval= [newStart, newEnd] where newStart and newEnd represent the start and end of this interval.
// Help Geek to insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
// Examples:
// Input: intervals = [[1,3], [4,5], [6,7], [8,10]], newInterval = [5,6]
// Output: [[1,3], [4,7], [8,10]]
// Explanation: The newInterval [5,6] overlaps with [4,5] and [6,7].

//used binary search for finding the position to insert the newInterval

class Solution {
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        ArrayList<int[]> finres = new ArrayList<>();
        int l=0,r=intervals.length-1;
        int pos = intervals.length;
        while(l<=r){
            int mid = l+(r-l)/2;
            
            if(intervals[mid][0] < newInterval[0]){
                l=mid+1;
            }
            else{
                pos = mid;
                r=mid-1;
            }
        }
        for(int i=0;i<pos;i++){
            res.add(intervals[i]);
        }
        res.add(newInterval);
        for(int i=pos;i<intervals.length;i++){
            res.add(intervals[i]);
        }
        for(int[] i:res){
            if(finres.isEmpty() || finres.get(finres.size()-1)[1]<i[0]){
                finres.add(i);
            }
            else{
                finres.get(finres.size()-1)[1]=Math.max(finres.get(finres.size()-1)[1],i[1]);
            }
        }
        return finres;
    }
}
