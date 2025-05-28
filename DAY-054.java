// Pair with given sum in a sorted array
// You are given an integer target and an array arr[]. You have to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.
// Note: pairs should have elements of distinct indexes. 
// Examples :
// Input: arr[] = [-1, 1, 5, 5, 7], target = 6
// Output: 3
// Explanation: There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.

class Solution {
    int countPairs(int arr[], int target) {
        int n=arr.length;
        int res=0;
        int l=0,r=n-1;
        while(l<r){
            if(arr[l]+arr[r] < target){
                l++;
            }
            else if(arr[l]+arr[r] > target){
                r--;
            }
            else{
                int c1=0 , c2=0;
                int e1=arr[l] , e2=arr[r];
                
                while(l<=r && arr[l]==e1){
                    l++;
                    c1++;
                }
                while(l<=r && arr[r]==e2){
                    r--;
                    c2++;
                }
                if(e1 == e2){
                    res+= (c1*(c1-1))/2;
                }
                else{
                    res+=c1*c2;
                }
            }
        }
        return res;
    }
}
