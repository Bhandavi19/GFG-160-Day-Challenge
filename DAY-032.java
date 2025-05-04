// K-th element of two Arrays
// Problem Statement : Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
// Examples :
// Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
// Output: 6
// Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.

//solved using brute force approach

class Solution {
    public int kthElement(int a[], int b[], int k) {
        int n=a.length;;
        int m=b.length;
        int arr[] = new int[n+m];
        int l=0;
        for(int i=0;i<n;i++){
            arr[l] = a[i];
            l++;
        }
        for(int i=0;i<m;i++){
            arr[l]=b[i];
            l++;
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
