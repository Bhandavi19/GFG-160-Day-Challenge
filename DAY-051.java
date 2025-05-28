// Count all triplets with given sum in sorted array
// Given a sorted array arr[] and a target value, the task is to count triplets (i, j, k) of valid indices, such that arr[i] + arr[j] + arr[k] = target and i < j < k.
// Examples:
// Input: arr[] = [-3, -1, -1, 0, 1, 2], target = -2
// Output: 4
// Explanation: Four triplets that add up to -2 are:
// arr[0] + arr[3] + arr[4] = (-3) + 0 + (1) = -2
// arr[0] + arr[1] + arr[5] = (-3) + (-1) + (2) = -2
// arr[0] + arr[2] + arr[5] = (-3) + (-1) + (2) = -2
// arr[1] + arr[2] + arr[3] = (-1) + (-1) + (0) = -2

class Solution {
    public int countTriplets(int[] arr, int target) {
        int n=arr.length;
        int res=0;
        for(int i=0;i<n-2;i++){
            int l=i+1,r=n-1;
            
            while(l<=r){
                int sum=arr[i]+arr[l]+arr[r];
                if(sum<target){
                    l++;
                }
                else if(sum>target){
                    r--;
                }
                else{
                    int c1=0,c2=0;
                    int e1=arr[l],e2=arr[r];
                    while(l<=r && e1==arr[l]){
                        l++;
                        c1++;
                    }
                    while(l<=r && e2==arr[r]){
                        r--;
                        c2++;
                    }
                    if(e1==e2){
                        res+=(c1*(c1-1))/2;
                    }
                    else{
                        res+=c1*c2;
                    }
                }
            }
        }
        return res;
    }
}
