// Sum Pair closest to target
// Given an array arr[] and a number target, find a pair of elements (a, b) in arr[], where a<=b whose sum is closest to target.
// Note: Return the pair in sorted order and if there are multiple such pairs return the pair with maximum absolute difference. If no such pair exists return an empty array.
// Examples:
// Input: arr[] = [10, 30, 20, 5], target = 25
// Output: [5, 20]
// Explanation: As 5 + 20 = 25 is closest to 25.

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> res = new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int l=0,r=n-1;
        int mindiff=Integer.MAX_VALUE;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(Math.abs(target-sum) < mindiff){
                mindiff=Math.abs(target-sum);
                res=Arrays.asList(arr[l],arr[r]);
            }
            if(sum<target){
                l++;
            }
            else if(sum>target){
                r--;
            }
            else{
                return res;
            }
        }
        return res;
    }
}
