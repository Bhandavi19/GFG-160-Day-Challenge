// Probelm Statement:Search Pattern (KMP-Algorithm)
// Given two strings, one is a text string txt and the other is a pattern string pat. The task is to print the indexes of all the occurrences of the pattern string in the text string. Use 0-based indexing while returning the indices. 
// Note: Return an empty list in case of no occurrences of pattern.
// Examples :
// Input: txt = "abcab", pat = "ab"
// Output: [0, 3]
// Explanation: The string "ab" occurs twice in txt, one starts at index 0 and the other at index 3.

class Solution {
  //lps array method
    private int[] lps(String pat){
        int m =pat.length();
        int lps[] = new int[m];
        int len=0;
        int i=1;
        
        while(i<m){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0){
                    len = lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    //pattern searching method
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> arr = new ArrayList<>();
        int lps[] = lps(pat);
        int i=0,j=0;
        while(i<txt.length()){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            if(j == pat.length()){
                arr.add(i-j);
                j = lps[j-1];
            }
            else if(i<txt.length() && txt.charAt(i) != pat.charAt(j)){
                if(j != 0){
                    j = lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return arr;
    }
}
