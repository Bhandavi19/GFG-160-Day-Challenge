// Sort 0s, 1s and 2s
// Probelm Statement : Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
// You need to solve this problem without utilizing the built-in sort function.
// Examples:
// Input: arr[] = [0, 1, 2, 0, 1, 2]
// Output: [0, 0, 1, 1, 2, 2]
// Explanation: 0s 1s and 2s are segregated into ascending order.

class Solution {
    public static void swap(int arr[] ,int i ,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sort012(int[] arr) {
        int n = arr.length;
        int i=0 , j=n-1 , m=0;
        while(m<=j){
            if(arr[m] == 0){
                swap(arr,m,i);
                i++;
                m++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else{
                swap(arr,m,j);
                j--;
            }
        }
    }
}
