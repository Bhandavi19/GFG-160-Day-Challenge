// Merge Without Extra Space
// Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.
// Examples:
// Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
// Output:
// 2 2 3 4
// 7 10
// Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10

class Solution {
    public void merge(int a[],int b[], int n, int m){
        int i=n-1;
        int j=0;
        while(i>=0 && j<m){
            if(a[i] > b[j]){
                int temp = a[i];
                a[i]=b[j];
                b[j]=temp;
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    public void mergeArrays(int a[], int b[]) {
        int n=a.length;
        int m=b.length;
        merge(a,b,n,m);
    }
}
