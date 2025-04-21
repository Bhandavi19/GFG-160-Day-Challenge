// Strings Rotations of Each Other
// Probelm Statement : You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.
// Note: The characters in the strings are in lowercase.
// Examples :
// Input: s1 = "abcd", s2 = "cdab"
// Output: true
// Explanation: After 2 right rotations, s1 will become equal to s2.

class Solution {
  //method to find the lps array
    private static int[] lps(String pat){
        int m = pat.length();
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
  //used KMP algorithm
    public static boolean areRotations(String s1, String s2) {
        String txt = s1+s1;
        String pat = s2;
        int lps[] = lps(pat);
        int i=0,j=0;
        
        while(i<txt.length()){
            if(txt.charAt(i) == pat.charAt(j)){
                i++;
                j++;
            }
            if(j == pat.length()){
                return true;
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
        return false;
    }
}
