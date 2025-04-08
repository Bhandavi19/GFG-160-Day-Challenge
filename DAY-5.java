// Next Permutation:
// Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 
// Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.
// Examples:
// Input: arr = [2, 4, 1, 7, 5, 0]
// Output: [2, 4, 5, 0, 1, 7]
// Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.

//I used the find pivot swap and reverse method to achieve this problem

class Solution {
    public void reverse(int arr[],int l,int r){
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp; 
            l++;
            r--;
        }
    }
    void nextPermutation(int[] arr) {
        int n=arr.length;
        int index=-1;
        
        for(int i=n-1;i>0;i--){
            if(arr[i-1]<arr[i]){
                index=i-1;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        reverse(arr,index+1,n-1);
    }
}
