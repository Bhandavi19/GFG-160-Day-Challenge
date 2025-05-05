// Allocate Minimum Pages
// Problem Statement : You are given an array arr[] of integers, where each element arr[i] represents the number of pages in the ith book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:
// Each student receives atleast one book.
// Each student is assigned a contiguous sequence of books.
// No book is assigned to more than one student.
// The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum.
// Note: Return -1 if a valid assignment is not possible, and allotment should be in contiguous order (see the explanation for better understanding).
// Examples:
// Input: arr[] = [12, 34, 67, 90], k = 2
// Output: 113
// Explanation: Allocation can be done in following ways:
// [12] and [34, 67, 90] Maximum Pages = 191
// [12, 34] and [67, 90] Maximum Pages = 157
// [12, 34, 67] and [90] Maximum Pages = 113.
// Therefore, the minimum of these cases is 113, which is selected as the output.

//here the r value should be taken as the sum of all the elements present in the array here. i have taken according to the constraints

class Solution {
    public static boolean valid(int arr[],int k, int m){
        int ans=0;
        int n=arr.length;
        k-=1;
        for(int i=0;i<n;i++){
            int val = arr[i];
            if(val>m){
                return false;
            }
            if(ans + val > m){
                k-=1;
                ans=0;
            }
            ans+=arr[i];
            if(k<0){
                return false;
            }
        }
        return true;
    }
    public static int findPages(int[] arr, int k) {
        int n=arr.length;
        if(k>n){
            return -1;
        }
        int l=0,r=(int)Math.pow(10,9);
        while(l<=r){
            int mid = l+(r-l)/2;
            if(valid(arr,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
