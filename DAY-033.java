// Aggressive Cows
// Problem Statement : You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
// Examples :
// Input: stalls[] = [1, 2, 4, 8, 9], k = 3
// Output: 3
// Explanation: The first cow can be placed at stalls[0], 
// the second cow can be placed at stalls[2] and 
// the third cow can be placed at stalls[3]. 
// The minimum distance between cows, in this case, is 3, which also is the largest among all possible ways.

//again used binary search to find the minimum distance

class Solution {
    public static boolean valid(int arr[],int k ,int mindis){
        int count = 1;
        int prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] - prev >= mindis){
                prev = arr[i];
                count++;
            }
        }
        return (count>=k);
    }
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int res= 0;
        int n=stalls.length;
        int l=1,r=stalls[n-1] - stalls[0];
        while(l<=r){
            int mid = l+(r-l)/2;
            if(valid(stalls,k,mid)){
                res=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}
