// Peak element
// Problem Statement : Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
// Note: Consider the element before the first element and the element after the last element to be negative infinity.
// Examples :
// Input: arr = [1, 2, 4, 5, 7, 8, 3]
// Output: true
// Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].

//used binary search for finding the peak element

class Solution {
    public int peakElement(int[] arr) {
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[n-1] > arr[n-2]){
            return n-1;
        }
        int l=1,r=n-2;
        while(l<=r){
            int mid=  l+(r-l)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] < arr[mid+1]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return 0;
    }
}
