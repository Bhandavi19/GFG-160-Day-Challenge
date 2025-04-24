// Count Inversions
// Problem Statement : Given an array of integers arr[]. Find the Inversion Count in the array.
// Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.
// Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
// If an array is sorted in the reverse order then the inversion count is the maximum. 
// Examples:
// Input: arr[] = [2, 4, 1, 3, 5]
// Output: 3
// Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

//used merge sort to count Inversions

class Solution {
    public static int mergeSort(int arr[],int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2=right - mid;
        int leftarr[] = new int[n1];
        int rightarr[]= new int[n2];
        int count=0;
        
        for(int i=0;i<n1;i++){
            leftarr[i] = arr[i+left];
        }
        for(int i=0;i<n2;i++){
            rightarr[i] = arr[mid +1+i];
        }
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftarr[i] <= rightarr[j]){
                arr[k++] = leftarr[i++];
            }
            else{
                arr[k++] = rightarr[j++];
                count += n1-i;
            }
        }
        while(i<n1){
            arr[k++] = leftarr[i++];
        }
        while(j<n2){
            arr[k++] =rightarr[j++];
        }
        return count;
    }
    public static int merge(int arr[] , int left, int right){
        int count = 0;
        int mid =0;
        if(left < right){
            mid = left + (right - left)/2;
            
            count += merge(arr , left , mid);
            count += merge(arr,mid+1,right);
            count += mergeSort(arr,left,mid,right);
        }
        return count;
    }
    static int inversionCount(int arr[]) {
         int n = arr.length;
         return merge(arr,0,n-1);
    }
}
